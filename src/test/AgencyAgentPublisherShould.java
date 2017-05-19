import domain.ad.PromotionPublishedAd;
import domain.ad.PublishedAd;
import domain.agency.AgencyAgentPublisher;
import org.junit.Test;

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AgencyAgentPublisherShould {

  @Test
  public void agency_agent_no_promotion_create_publishAd() {
    AgencyAgentPublisher agencyAgentPublisher = new AgencyAgentPublisher(randomUUID(), false);
    PublishedAd publishedAd = agencyAgentPublisher.publisher(randomUUID(), "title", "desc");

    assertTrue(publishedAd instanceof PublishedAd);
    assertFalse(publishedAd instanceof PromotionPublishedAd);
  }

  @Test
  public void agency_agent_create_promotion_publishAd() {
    AgencyAgentPublisher agencyAgentPublisher = new AgencyAgentPublisher(randomUUID(), true);
    PublishedAd publishedAd = agencyAgentPublisher.publisher(randomUUID(), "title", "desc");

    assertNotNull(publishedAd);
    assertTrue(publishedAd instanceof PromotionPublishedAd);
  }
}
