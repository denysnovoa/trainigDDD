package domain.agency;

import domain.ad.OrdinaryPromotionPublishedAd;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import domain.agent.Agent;
import domain.portal.PortalNotPublishException;
import java.util.UUID;

public class AgencyAgentPublisher implements Agent {

  private final boolean promotion;
  private UUID publisherId;

  public AgencyAgentPublisher(UUID publisherId, boolean promotion) {
    this.publisherId = publisherId;
    this.promotion = promotion;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) throws PortalNotPublishException {
    return promotion
        ? new OrdinaryPromotionPublishedAd()
        : new OrdinaryPublishedAd(publisherId, (PrivateAd) ad);

  }
}
