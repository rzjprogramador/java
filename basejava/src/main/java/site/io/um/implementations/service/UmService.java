package site.io.um.implementations.service;

public class UmService {
  static UmModel umservice = new UmModel("valortexto", 100, true);

  public static void main(String[] args) {
    umservice.showStatus();
  }
}
