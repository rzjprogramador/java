package site.servicos.um;

import java.io.IOException;

import externals.value_objects.numero.NumeroMenorQueCinco;

public class UmModel {

  private UmTypeArgs args = new UmTypeArgs();
  // TODO: esta dependendo de uma classe concreta - tentar contrato

  UmModel(String t, int n, boolean l, int ns) throws IOException {
    this.args.texto = this.setTexto(t);
    this.args.numero = this.setNumero(n);
    this.args.logico = this.setLogico(l);
    this.args.numeroMaiorQue5 = NumeroMenorQueCinco.execute(ns);
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
    System.out.println("numeroMaiorQue5: " + this.args.numeroMaiorQue5);
    System.out.println("---------- ### ----------");
  }
}
