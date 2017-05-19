import domain.ad.PrivateAd;
import domain.portal.PartnerPortal;
import domain.portal.PortalNotPublishException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class PartnerPortalPublishShould {

  private UUID publisherId;
  private UUID propertyId;

  @Test
  public void publish_ad_without_moderation() throws PortalNotPublishException {
    PartnerPortal partnerPortal = new PartnerPortal(publisherId);

    Assert.assertNotNull(partnerPortal.publish(new PrivateAd(propertyId, "title", "description")));
  }
}
