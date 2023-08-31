package com.site.fundamentos.a_dados.caneta;

public class Caneta {
  private String modelo;
  private Double ponta;
  private String cor;
  private Boolean tampada;

  // metodoConstrutor obs: construtor é só public NomeDaClasse
  public Caneta(String m, Double p, String c) {
    this.tampar();
    this.setCor(c);

    this.setModelo(m);
    this.setPonta(p);

  }

  public String getModelo() { return this.modelo; }
  public String getCor() { return this.cor; }
  public Double getPonta() { return this.ponta; }

  public void setModelo(String m) { this.modelo = m; }
  public void setCor(String c) { this.cor = c; }
  public void setPonta(Double p) { this.ponta = p; }

  public void tampar() { this.tampada = true; }
  public void destampar() { this.tampada = false; }

  public <AnyType> void Print(AnyType... a) {
    for(int posicao=0; posicao < a.length; posicao++) {
      System.out.println(a[posicao]);
    }
  }

  public void statusObjeto() {
    this.Print(
      "Modelo: " + this.modelo,
      "Ponta: " + this.ponta,
      "Cor: " + this.cor,
      "Tampada: " + this.tampada,

      "Eu tenho um caneta: " + this.getModelo(),

      "",
      "--------------///----------------",
      ""
    );


  }

}
