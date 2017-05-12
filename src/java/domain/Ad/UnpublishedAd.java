package domain.Ad;

public interface UnpublishedAd extends Ad {
  PublishedAd publish();

  ErasedAd erased();

  ExpiredAd expire();
}
