package domain.ad;

public interface UnpublishedAd extends Ad {
  PublishedAd publish();

  ErasedAd erased();

  ExpiredAd expire();
}
