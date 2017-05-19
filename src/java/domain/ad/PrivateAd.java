package domain.ad;

import java.util.UUID;

public class PrivateAd implements UnpublishedAd {
  public final UUID propertyId;
  public final String title;
  public final String description;

  public PrivateAd(UUID propertyId, String title, String description) {
    this.propertyId = propertyId;
    this.title = title;
    this.description = description;
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
