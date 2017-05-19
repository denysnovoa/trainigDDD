import domain.ad.PrivateAd;
import domain.ad.PromotionPublishedAd;
import domain.ad.PublishedAd;
import domain.agency.AgencyAgentPublisher;
import domain.portal.PortalNotPublishException;
import org.junit.Test;

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AgencyAgentPublisherShould {

  @Test
  public void agency_agent_no_promotion_create_publishAd() throws PortalNotPublishException {
    AgencyAgentPublisher agencyAgentPublisher = new AgencyAgentPublisher(randomUUID(), false);
    PublishedAd publishedAd = agencyAgentPublisher.publish(new PrivateAd(randomUUID(), "title", "desc"));

    assertTrue(publishedAd instanceof PublishedAd);
    assertFalse(publishedAd instanceof PromotionPublishedAd);
  }

  @Test
  public void agency_agent_create_promotion_publishAd() throws PortalNotPublishException {
    AgencyAgentPublisher agencyAgentPublisher = new AgencyAgentPublisher(randomUUID(), true);
    PublishedAd publishedAd = agencyAgentPublisher.publish(new PrivateAd(randomUUID(), "title", "desc"));

    assertNotNull(publishedAd);
    assertTrue(publishedAd instanceof PromotionPublishedAd);
  }
}
