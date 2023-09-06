package site.services.um;

import site.contracts.um.UmTypeArgs;

public class UmModel {

  private UmTypeArgs args = new UmTypeArgs();
  // TODO: esta dependendo de uma classe concreta - tentar contrato

  UmModel(String t, int n, boolean l) {
    this.args.texto = this.setTexto(t);
    this.args.numero = this.setNumero(n);
    this.args.logico = this.setLogico(l);
  }

  public String setTexto(String t) {
    return this.args.texto = t;
  }

  public int setNumero(int n) {
    if(n <= 4) {
      return this.args.numero = 999;
    }
    return this.args.numero = n;
  }

  public boolean setLogico(boolean l) {
    return this.args.logico = l;
  }

  public void showStatus() {
    System.out.println("------ show Status ------");
    System.out.println("texto: " + this.args.texto);
    System.out.println("numero: " + this.args.numero);
    System.out.println("logico: " + this.args.logico);
    System.out.println("---------- ### ----------");
  }
}
