package site.servicos.um;

import java.io.IOException;

public class UmService {

  public static UmModel execute(String t, int n, boolean l, int ns) throws IOException {
    UmModel umservice = new UmModel(t, n, l, ns);
      return umservice;
  }

}
