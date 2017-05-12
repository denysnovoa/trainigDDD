package domain.agent;

import domain.ad.PublishedAd;
import domain.ad.UnpublishedAd;

public class IndependentAgentImpl implements Agent {

  private Email email;

  void IndependentAgentImpl(String emailValue) throws EmailNotValidException {
    email = new Email(emailValue);
  }

  @Override
  public PublishedAd publish(UnpublishedAd ad) {
    return ad.publish();
  }
}
