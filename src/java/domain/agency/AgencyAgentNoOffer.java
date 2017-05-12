package domain.agency;

import domain.ad.OrdinaryPublishedAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class AgencyAgentNoOffer implements AgencyAgent {

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new OrdinaryPublishedAd(ad);
  }
}
