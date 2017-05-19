package domain.agency;

import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class AgencyAgentNoOffer implements AgencyAgent {
  public final UUID publisherId;

  public AgencyAgentNoOffer(UUID publisherId) {
    this.publisherId = publisherId;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new OrdinaryPublishedAd(publisherId, (PrivateAd) ad);
  }
}
