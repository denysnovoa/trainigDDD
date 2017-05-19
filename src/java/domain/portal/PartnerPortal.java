package domain.portal;

import domain.ad.AdPublisher;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class PartnerPortal implements AdPublisher {

  public final UUID publisherId;


  public PartnerPortal(UUID publisherId) {
    this.publisherId = publisherId;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) throws PortalNotPublishException {
    return new OrdinaryPublishedAd(publisherId, (PrivateAd) ad) {
    };
  }
}
