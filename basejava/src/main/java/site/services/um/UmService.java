package site.services.um;

public class UmService {
  // static UmModel umservice = new UmModel("valortexto", 1, true);

  public UmModel execute(String t, int n, boolean l) {
    UmModel umservice = new UmModel(t, n, l);
    return umservice;
  }
}
