package domain.agency;

import domain.ad.AdPublisher;
import domain.ad.BumpedPublishedAdStandard;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class AgencyAgentOffer implements AdPublisher {

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new BumpedPublishedAdStandard(ad);
  }
}
