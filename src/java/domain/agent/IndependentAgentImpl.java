package domain.agent;

import domain.ad.OrdinaryModeratedAd;
import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class IndependentAgentImpl implements Agent {
  public final UUID publisherId;
  private final Email email;
  private final boolean important;


  public IndependentAgentImpl(String emailValue, UUID publisherId, boolean important) throws EmailNotValidException {
    email = new Email(emailValue);
    this.publisherId = publisherId;
    this.important = important;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {

    return important
        ? new OrdinaryPublishedAd(publisherId, (PrivateAd) ad)
        : new OrdinaryModeratedAd(publisherId);
  }
}
