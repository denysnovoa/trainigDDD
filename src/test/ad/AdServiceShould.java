package ad;

import domain.ad.Ad;
import domain.ad.AdPublisher;
import domain.ad.AdService;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.portal.PortalNotPublishException;
import org.junit.Test;
import org.mockito.Mockito;

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

public class AdServiceShould {

  @Test
  public void publishAnAdByPublisher() throws PortalNotPublishException {

    final PrivateAd privateAd = new PrivateAd(randomUUID(), "title", "description");

    final OrdinaryPublishedAd publishedAd = new OrdinaryPublishedAd(randomUUID(), privateAd);

    AdPublisher publisher = Mockito.mock(AdPublisher.class);

    given(publisher.publish(privateAd))
        .willReturn(publishedAd);

    AdService adService = new AdService();
    Ad ad = adService.publish(publisher, privateAd);

    assertEquals(ad, publishedAd);
  }
}
