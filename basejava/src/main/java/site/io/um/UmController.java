package site.io.um;

import site.services.um.UmModel;
import site.services.um.UmService;

public class UmController {
  static UmService service = new UmService();
  public static void main(String[] args) {
    UmModel result = service.execute("valortexto", 100, true);
    result.showStatus();
  }

}