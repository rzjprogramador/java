package site.io.um;

import site.services.um.UmModel;
import site.services.um.UmService;

public class UmController {
  static UmService service = new UmService();
  public static void main(String[] args) {

    try {
    UmModel result = service.execute("valortexto", 100, true, 11);
      result.showStatus();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      // e.printStackTrace();
    }
  }

}