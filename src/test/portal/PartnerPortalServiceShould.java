package portal;

import domain.portal.PartnerPortal;
import domain.portal.PortalService;
import org.junit.Assert;
import org.junit.Test;

public class PartnerPortalServiceShould {
  @Test
  public void createAPartnerPortal() throws Exception {

    PortalService portalService = new PortalService();
    PartnerPortal partnerPortal = portalService.create();

    Assert.assertNotNull(partnerPortal);
  }
}
