package domain.agency;

import domain.ad.BumpedPublishedAd;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.time.LocalDate;
import java.util.UUID;

public class AgencyAgentWithIf implements AgencyAgent {
  public final UUID agentId;
  public final boolean hasOffer;

  public AgencyAgentWithIf(UUID agentId, boolean hasOffer) {
    this.agentId = agentId;
    this.hasOffer = hasOffer;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    if (!(ad instanceof PrivateAd)) {
      throw new RuntimeException();
    }

    if (hasOffer) {
      return new BumpedPublishedAd((PrivateAd) ad, agentId, LocalDate.now());
    } else {
      return new OrdinaryPublishedAd(agentId, (PrivateAd) ad);
    }
  }
}
