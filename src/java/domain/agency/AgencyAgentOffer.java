package domain.agency;

import domain.ad.AdPublisher;
import domain.ad.BumpedPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.time.LocalDate;
import java.util.UUID;

public class AgencyAgentOffer implements AdPublisher {

  private LocalDate bumpDate;
  UUID publisherId;

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new BumpedPublishedAd((PrivateAd) ad, publisherId, bumpDate);
  }
}
