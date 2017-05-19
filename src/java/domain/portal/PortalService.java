package domain.portal;

import static java.util.UUID.randomUUID;

public class PortalService {

  public PartnerPortal create() {
    return new PartnerPortal(randomUUID());
  }
}
