package domain.ad;

import java.util.UUID;

public class OrdinaryModeratedAd implements ModerateAd {
  public final UUID publisherId;
  public final String title;
  public final String description;

  public OrdinaryModeratedAd(UUID publisherId, String title, String description) {
    this.publisherId = publisherId;
    this.title = title;
    this.description = description;
  }

  @Override
  public UnpublishedAd unPublish() {
    return null;
  }
}
