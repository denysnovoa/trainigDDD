package domain.ad;

public interface ErasedAd extends Ad {
  UnpublishedAd recover();
}
