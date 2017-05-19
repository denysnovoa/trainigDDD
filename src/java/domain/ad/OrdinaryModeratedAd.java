package domain.ad;

import java.util.UUID;

public class OrdinaryModeratedAd implements ModerateAd {
  public final UUID publisherId;

  public OrdinaryModeratedAd(UUID publisherId) {
    this.publisherId = publisherId;
  }

  @Override
  public UnpublishedAd unPublish() {
    return null;
  }
}
