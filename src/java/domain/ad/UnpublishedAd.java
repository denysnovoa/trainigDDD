package domain.ad;

public interface UnpublishedAd extends Ad {
  ErasedAd erased();

  ExpiredAd expire();
}
