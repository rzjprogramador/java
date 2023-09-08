package site.services.um;

import java.io.IOException;

public class UmService {

  public UmModel execute(String t, int n, boolean l, int ns) throws IOException {
    UmModel umservice = new UmModel(t, n, l, ns);
      return umservice;

      // SE NÃO QUERO TRATAR AQUI NÃO PRECISO FAZER TRY_CATCH
    // try {
    //   UmModel umservice = new UmModel(t, n, l, ns);
    //   return umservice;
    // } catch (IOException e) {
    //   System.out.println("Esta variavel erro posso fazer alguma resposta neste momento.");
    //   throw e;
    // }
  }
}
