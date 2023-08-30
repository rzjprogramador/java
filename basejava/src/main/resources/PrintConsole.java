package com.site.resources;

public class PrintConsole {

  public static <AnyType> void Print(AnyType... a) {
    for(int posicao=0; posicao < a.length; posicao++) {
      System.out.println(a[posicao]);
    }
  }

}
