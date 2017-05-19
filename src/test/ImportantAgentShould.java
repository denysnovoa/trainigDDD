import domain.ad.ModerateAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import domain.agent.EmailNotValidException;
import domain.agent.IndependentAgentImpl;
import java.util.UUID;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ImportantAgentShould {

  private UUID publisherId;
  private String email;
  private UUID propertyId;
  private UnpublishedAd A_PRIVATE_AD = new PrivateAd(propertyId, "title", "description");

  @Test
  public void agent_important_publish_a_publishedAd() throws EmailNotValidException {

    IndependentAgentImpl independentAgent = new IndependentAgentImpl(email, publisherId, true);

    assertTrue(independentAgent.publish(A_PRIVATE_AD) instanceof PublishedAd);
  }

  @Test
  public void agent_important_no_publish_a_moderateAd() throws EmailNotValidException {

    IndependentAgentImpl independentAgent = new IndependentAgentImpl(email, publisherId, true);

    assertFalse(independentAgent.publish(A_PRIVATE_AD) instanceof ModerateAd);
  }

  @Test
  public void agent_no_important_publish_moderateAd() throws EmailNotValidException {
    IndependentAgentImpl independentAgent = new IndependentAgentImpl(email, publisherId, false);

    assertTrue(independentAgent.publish(A_PRIVATE_AD) instanceof ModerateAd);
  }
}
