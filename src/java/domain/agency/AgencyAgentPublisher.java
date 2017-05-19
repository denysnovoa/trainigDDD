package domain.agency;

import domain.ad.OrdinaryPromotionPublishedAd;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import java.util.UUID;

public class AgencyAgentPublisher {

  private final boolean promotion;
  private UUID publisherId;

  public AgencyAgentPublisher(UUID publisherId, boolean promotion) {
    this.publisherId = publisherId;
    this.promotion = promotion;
  }

  public PublishedAd publisher(UUID propertyId, String title, String description) {
    return promotion
        ? new OrdinaryPromotionPublishedAd()
        : new OrdinaryPublishedAd(publisherId, new PrivateAd(propertyId, title, description));
  }
}
