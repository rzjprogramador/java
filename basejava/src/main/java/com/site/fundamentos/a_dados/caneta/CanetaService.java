package com.site.fundamentos.a_dados.caneta;

public class CanetaService {
  public static void main(String[] args) {
    Caneta caneta1 = new Caneta("BIC 1", 0.5, "Azul");

    // uso instancia no servico:

    caneta1.destampar();

    caneta1.statusObjeto();

  }
}
