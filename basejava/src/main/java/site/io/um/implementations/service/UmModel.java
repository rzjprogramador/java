package site.io.um.implementations.service;

import site.io.um.contracts.UmArgs;

public class UmModel {
  // public static UmArgs args;
  // String texto;
  // int numero;
  // boolean logico;

  private UmArgs args;

  UmModel(String t, int n, boolean l) {
    this.args.
    this.args.texto = t;
    // this.args.numero = n;
    // this.args.logico = l;
  }

  public void showStatus() {
    System.out.println("------ show Status ------");
    System.out.println("texto: " + this.texto);
    System.out.println("numero: " + this.numero);
    System.out.println("logico: " + this.logico);
    System.out.println("---------- ### ----------");
  }
}
