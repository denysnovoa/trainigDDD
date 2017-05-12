package domain.ad;

import java.util.UUID;

public class PrivateAd implements UnpublishedAd {
  public final UUID propertyId;

  public PrivateAd(UUID propertyId) {
    this.propertyId = propertyId;
  }

  @Override
  public ErasedAd erased() {
    return null;
  }

  @Override
  public ExpiredAd expire() {
    return null;
  }
}
