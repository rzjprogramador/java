package com.site.fundamentos.a_dados.caneta;

public class CanetaService {
  public static void main(String[] args) {
    Caneta caneta1 = new Caneta("BIC 1", 0.5, "Azul");
    Caneta caneta2 = new Caneta("FOO 2", 10.1, "ouro");

    // uso instancia no servico:

    caneta1.destampar();
    caneta1.statusObjeto();

    caneta2.tampar();
    caneta2.statusObjeto();

  }
}
