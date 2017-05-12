package domain.portal;

import domain.ad.AdPublisher;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class PartnetshipPortal implements AdPublisher, Portal {
  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return null;
  }
}
