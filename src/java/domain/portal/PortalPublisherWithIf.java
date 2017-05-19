package domain.portal;

import domain.ad.AdPublisher;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class PortalPublisherWithIf implements AdPublisher {

  private final UUID publisherId;
  private final String partnetshIp;

  public PortalPublisherWithIf(UUID publisherId, String partnetshIp) {
    this.publisherId = publisherId;
    this.partnetshIp = partnetshIp;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) throws PortalNotPublishException {
    if (partnetshIp != "fotocasa")
      throw new PortalNotPublishException();

    return new OrdinaryPublishedAd(publisherId, (PrivateAd) ad);
  }
}
