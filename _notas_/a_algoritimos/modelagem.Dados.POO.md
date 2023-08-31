# Modelagem Dados

# DADO_DEFINICOES
1. cicloParaFormarDado: em POO para formar e filtrar os dados eles cumprem um cicloComMetodosEspeciais :
  1.cicloComMetodosEspeciais:
    1. [
      {paramsViaConstrutor : dadoVemDinamicoDeFora},
      {getter: regraParaVer},
      {setter : regraValidaPreenchimento, e daí vai para a propAtributo: dadoProtegidoeValidado}
    ]

# artefato : valor : informacao
1. declaracao
  1. declaracao: "declarar é anunciar que agora existe que nasceu o artefato.",
  2. assinatura: a assinatura é um contrato tem que cumprir conforme declarou :: da mesma forma que se declara um novo artefato se declara para parametros, <DECLARACOES NÃO MUDAM>. ex: preciso declarar um parametroArray, parametro é uma variavel, então declaro o parametroArray da mesma forma que estivesse declarando-o normalmente fora de parametros. declaracoes nao mudam e parametros são variaveis que precisam ser declaradas normalmente. obs: podemos declarar e não preencher o valor ou declarar e já preencher o valor conforme a necessidade tem linguagem ts js que precisa em classes inserir ! afirmação que pode confiar que o artefato deve existir de inicio sem preenchimento.

  3. uso_artefato: sempre quando chama um artefato, Pergunte e expresse QUEM É ESTE?, computacional apartir do seu valor, mando fazer alguma #Acao.


# VISIBILIDADES
1. visibilidadeMetodosEspeciais:
  1. paraUso_Cliente: público
  2. paraUso_Sistema: [privado(quando a mesma classe vai implementar), ou protegido(quando outras classes vão implementar)]

# DADOS_UTILIZADOR
1. argumento:
  1. conceito: "Éo preenchimento com valor ou indicacao que resulta em valor feita pelo utilizador Client ou Codigo.", narracao: PREENCHO DAR VALOR AO QUE PEDI, ex: Preencho a string, preencho o objeto, etc...

# ACESSOS
1. modificadores_de_acesso_emClasses:
  1. #modificadorDeAcesso protected /protegido da acesso direto sem ter e set as props do Pai somente para as classes que herdam.

# CONSTRUCAO DE VALOR
1. construcao_de_valor_dentro_de_bloco: é uma #sequenciaLogica, vai #contruindo #valor de acordo com o #tipo do artefato que se formou seu valor que esta trabalhando no momento e encaixando as peças de forma #logica que faz #sentido.


# INFORMACAO_MUDAVEL_DINAMICO
1. valor_dinamico_em_configurada :
  1. conceito:  o #valor passivel de mudança use como #parametro, se uma única COISA vai mudar use #Parâmetro no lugar para a escolha no uso  ser #valorDinamico ,  se essa mudança for type use #paramGeneric

1. prepararParaReceberDiversos_DoMesmoTipo_ViaParams:
  1. em_Java:
    * VarArgs: VarArgs é um sintaxSugar com 3 pontos APÓS a declaracao do tipo, para nao precisar declarar : tipo[] , faz então tipo...3pontos #novaReferenciaDoArray
    * declaracao: o (tipo... variavelQueGuardara_e_SeraReferencia)
    * vantagem: varArgs sintax sugapara receber array em metodo e na chamada poder passar objReferencia ou items soltos.ex: (1, 2, 3, 4).
    * obs: o parametro varArgs sempre tera que ser o primeiro, ele nao pode vir em outra posicao.


# INFORMACAO OBRIGATORIA
informacao_Obrigatoria: "em #poo vc pede o valorObrigatorio para se cadastrar na criaçao no #construtor, pergunte se: _ Quando criar está Entidade tenho que ter está OUTRA? se sim ela é obrigatória, construa na criaçao se não não use na criaçao. #relacionamento, #associacao",

# CONFIGURADORAS_CARACTERISTICAS_CAMPOS
  1. valor_em_Classe_Atributo_Prop:
    1. conceito: "#supremo #poo Campos atributos representam propriedades de algo do mundo real em código."
  1. diversos_valores_Objeto: "#artefatos 1 informacao usa variavel pra guardar, mais que uma informacao use objeto para guarda, por que são conjunto de variaveis e metodos [membros] ",

  2. parametro:
    1. conceito: parametro é um futuro valor um contrato substituidor ... uma variavel que será reescrita conforme quem vai usar obs: tem que ser do mesmo tipo do contrato a inserção de quem vai usar.
    2. aplicabilidade: "#parametros #valor, quando precisamos de params é quando o valor vai vir pelo cliente, quando o valor vai ser pego na memória já existe gravado atribuído não precisos pega-lo por param"

