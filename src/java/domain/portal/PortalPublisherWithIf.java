package domain.portal;

import domain.ad.AdPublisher;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class PortalPublisherWithIf implements AdPublisher {

  private final UUID publisherId;
  private final String partnetship;

  public PortalPublisherWithIf(UUID publisherId, String partnetship) {
    this.publisherId = publisherId;
    this.partnetship = partnetship;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) throws PortalNotPublishException {
    if (partnetship != "fotocasa")
      throw new PortalNotPublishException();

    return new OrdinaryPublishedAd(publisherId, (PrivateAd) ad);
  }
}
