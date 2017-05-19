package domain.ad;

import domain.portal.PortalNotPublishException;

public class AdService {

  public Ad publish(AdPublisher publisher, UnpublishedAd unPublishAd) throws PortalNotPublishException {
    return publisher.publish(unPublishAd);
  }
}
