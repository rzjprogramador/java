package com.site.fundamentos.c_contratos_interfaces;

interface Interface1 {
  int num1 = 0;

  void metodo1();
  void metodo2();

  default void metodoDefaultNaoObrigatorio1() {
    System.out.println("Metodo default não é obrigatorio implementar em quem implementa a interface, Aqui na sua assinatura SIM tem que implementar, e ele estará disponivel no objeto final a classe que implements implementando @sobreescrevendo ou não.");
  }
  default void metodoDefaultNaoObrigatorio2() {
    System.out.println("Metodo default 2");
  }
}

class UseInterface1 implements Interface1 {
  int num1 = 100;

  public void metodo1() {
    System.out.println("Metodo1");
    System.out.println("O valor de num1 é: " + this.num1);
  }

  public void metodo2() {
    System.out.println("Metodo2");
  }
}

class MainInterface1 {
  public static void main(String[] args) {
    Interface1 i1 = new UseInterface1();
    i1.metodo1();
    i1.metodo2();
    i1.metodoDefaultNaoObrigatorio1();
  }
}
