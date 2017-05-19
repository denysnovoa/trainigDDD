package domain.agent;

import domain.ad.OrdinaryPublishedAd;
import domain.ad.PrivateAd;
import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;
import java.util.UUID;

public class IndependentAgentImpl implements Agent {
  public final UUID publisherId;
  private final Email email;

  IndependentAgentImpl(String emailValue, UUID publisherId) throws EmailNotValidException {
    email = new Email(emailValue);
    this.publisherId = publisherId;
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return new OrdinaryPublishedAd(publisherId, (PrivateAd) ad);
  }
}
