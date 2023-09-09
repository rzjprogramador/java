package site.io.recursos;

import helpers.HttpResponse;
import site.servicos.um.UmService;

public class UmController {

  public static HttpResponse perform() {

    try {
      return HttpResponse.ok(
        200,
        UmService.execute("valortexto", 100, true, 11)
      );
    } catch (Exception e) {
      return HttpResponse.fail(
        400,
        e.getMessage()
      );
    }
  }

}