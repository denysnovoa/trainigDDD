package domain.Ad;

public interface UnpublishedAd extends Ad {
  PublishedAd published();

  ErasedAd erased();
}
