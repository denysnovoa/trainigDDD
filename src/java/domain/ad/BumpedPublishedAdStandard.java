package domain.ad;

public class BumpedPublishedAdStandard implements BumpedPublishedAd {

  private final UnpublishedAd ad;

  public BumpedPublishedAdStandard(UnpublishedAd ad) {
    this.ad = ad;
  }

  @Override
  public UnpublishedAd unPublish() {
    return ad;
  }
}
