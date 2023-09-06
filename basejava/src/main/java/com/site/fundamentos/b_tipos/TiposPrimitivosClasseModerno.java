package com.site.fundamentos.b_tipos;

public class TiposPrimitivosClasseModerno {
  // texto
  public static String textoSempreEntreAspasDuplas = "Reinaldo";
  public static char caractereUnicoEntreAspasSimples = 'M';

  // numeros
  public static Byte byteAte127 = 127;
  public static Short shortAte32767 = 128;
  public static int numeroInteiro = 10;
  public static Long numeroGiganteLongo = 10_000_000L;
  public static Double doubleDecimalIdeal = 20.20D;
  public static Float floatDecimalAntigo = (float) 10.11;

  // objects
  // public static AnyType anyLivreQualquerTipo = "any valor";

  // logico
  public static Boolean verdadeiroTrue_Ou_Falso_False = true;

  // Print Local
  public static <AnyType> void Print(AnyType... a) {
    for(int posicao=0; posicao < a.length; posicao++) {
      System.out.println(a[posicao]);
    }
  }

  public static void main(String[] args) {
    TiposPrimitivosClasseModerno.Print(
      "String : " + TiposPrimitivosClasseModerno.textoSempreEntreAspasDuplas,
      "char1 : " + TiposPrimitivosClasseModerno.caractereUnicoEntreAspasSimples,
      "Byte127 : " + TiposPrimitivosClasseModerno.byteAte127,
      "Short32767: " + TiposPrimitivosClasseModerno.shortAte32767,
      "numeroInteiro: " + TiposPrimitivosClasseModerno.numeroInteiro,
      "Long numeroLongo: " + TiposPrimitivosClasseModerno.numeroGiganteLongo,
      "Float floatDecimalAntigo"  + TiposPrimitivosClasseModerno.floatDecimalAntigo,
      "Double doubleDecimalIdeal: " + TiposPrimitivosClasseModerno.doubleDecimalIdeal,
      "Boolean verdadeiroTrue_Ou_Falso_False: " + TiposPrimitivosClasseModerno.verdadeiroTrue_Ou_Falso_False
      );

  }

}
