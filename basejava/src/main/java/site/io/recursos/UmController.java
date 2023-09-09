package site.io.recursos;

import helpers.HttpResponse;
import site.servicos.um.UmModel;
import site.servicos.um.UmService;

public class UmController {
  static UmService service = new UmService();

  public static void perform() {
    try {
    UmModel result = service.execute("valortexto", 100, true, 1);
      result.showStatus();
    } catch (Exception e) {
      HttpResponse.fail(400,  e.getMessage() );
    }
  }

}