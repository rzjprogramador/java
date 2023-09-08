package site.value_objects.numero;

import java.io.IOException;

public class NumeroMenorQueCinco {
  public int numero;

  public NumeroMenorQueCinco(int n) throws IOException {
    this.numero = this.setNumero(n);
  }

  public int getNumero() {
    return this.numero;
  }

  public int setNumero(int n) throws IOException {
    if(n <= 5) {
      throw new IllegalArgumentException("Não pode ser menor que 5");
    }
    return this.numero = n;
  }

  public static int execute(int n) throws IOException {
    NumeroMenorQueCinco num =  new NumeroMenorQueCinco(n);
    return num.numero;
  }
}
