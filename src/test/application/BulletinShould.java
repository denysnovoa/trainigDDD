package application;

import domain.ad.Ad;
import domain.ad.AdPublisher;
import domain.ad.AdService;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.portal.PartnerPortal;
import domain.portal.PortalNotPublishException;
import domain.portal.PortalService;
import org.junit.Test;
import org.mockito.Mockito;

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class BulletinShould {

  @Test
  public void publishAnAdThroughAnAgent() throws Exception, PortalNotPublishException {

    final AdService adService = Mockito.mock(AdService.class);
    final PortalService portalService = Mockito.mock(PortalService.class);

    final PrivateAd privateAd = new PrivateAd(randomUUID(), "title", "description");
    final OrdinaryPublishedAd publishedAd = new OrdinaryPublishedAd(randomUUID(), privateAd);
    AdPublisher publisher = Mockito.mock(AdPublisher.class);

    given(portalService.create()).willReturn(new PartnerPortal(randomUUID()));
    given(publisher.publish(privateAd)).willReturn(publishedAd);
    given(adService.publish(publisher, privateAd)).willReturn(new PrivateAd(randomUUID(), "title", "Description"));

    Bulletin bulletin = new Bulletin(portalService, adService);
    Ad ad = bulletin.publish(publisher, privateAd);

    assertNotNull(ad);
    verify(adService).publish(publisher, privateAd);

  }
}
