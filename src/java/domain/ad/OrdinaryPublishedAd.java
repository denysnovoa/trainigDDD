package domain.ad;

import java.util.UUID;

public class OrdinaryPublishedAd implements PublishedAd {
  public final UUID publisherId;
  public final UUID propertyId;

  public OrdinaryPublishedAd(UUID publisherId, PrivateAd privateAd) {
    this.publisherId = publisherId;
    this.propertyId = privateAd.propertyId;
  }

  @Override
  public UnpublishedAd unPublish() {
    return null;
  }
}
