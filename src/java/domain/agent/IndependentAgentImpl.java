package domain.agent;

import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class IndependentAgentImpl implements Agent {

  private final Email email;

  IndependentAgentImpl(String emailValue) throws EmailNotValidException {
    email = new Email(emailValue);
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return ad.publish();
  }
}
