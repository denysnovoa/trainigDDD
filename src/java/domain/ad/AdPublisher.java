package domain.ad;

import domain.portal.PortalNotPublishException;

public interface AdPublisher {
  PublishedAd publish(UnpublishedAd ad) throws PortalNotPublishException;
}
