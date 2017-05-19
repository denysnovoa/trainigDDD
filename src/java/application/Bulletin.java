package application;

import domain.ad.Ad;
import domain.ad.AdPublisher;
import domain.ad.AdService;
import domain.ad.PrivateAd;
import domain.portal.PortalNotPublishException;
import domain.portal.PortalService;

public class Bulletin {
  private final PortalService portalService;
  private final AdService adService;

  public Bulletin(PortalService portalService, AdService adService) {
    this.portalService = portalService;
    this.adService = adService;
  }

  public Ad publish(AdPublisher publisher, PrivateAd privateAd) throws PortalNotPublishException {
    return adService.publish(publisher, privateAd);
  }
}
