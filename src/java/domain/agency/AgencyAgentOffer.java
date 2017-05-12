package domain.agency;

import domain.ad.AdPublisher;
import domain.ad.BumpedPublishedAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class AgencyAgentOffer implements AdPublisher {

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new BumpedPublishedAd(ad, publisherId, bumpDate);
  }
}
