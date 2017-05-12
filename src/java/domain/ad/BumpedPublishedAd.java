package domain.ad;

import java.time.LocalDate;
import java.util.UUID;

public class BumpedPublishedAd implements PublishedAd {

  public final UUID publisherId;
  public final UUID propertyId;
  public final LocalDate bumpDate;

  public BumpedPublishedAd(PrivateAd ad, UUID publisherId, LocalDate bumpDate) {
    this.propertyId = ad.propertyId;
    this.publisherId = publisherId;
    this.bumpDate = bumpDate;
  }

  @Override
  public UnpublishedAd unPublish() {
    return new PrivateAd(propertyId);
  }
}
