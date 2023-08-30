# ARTEFATOS
1. valor : [ literalMarretado, dinamicoViaParams, dinamicoPorPosicao, capturado,  ]
2. artefato : [ preenchidoPRONTO, referenciaGeradora_DE_PRONTO ]
3. tipo : [ tiposPrimitivos, tiposPrimitivosObjeto, tiposPersonalizados_GeradoPorClasses ]

# LIÇÕES ESTRUTURA MODELO DE DADOS

- objetivo: gerar instancias de objeto que tenha características e comportamentos, usar Estrutura_Dado : classe

- declaracao: cada artefato para estar no objeto final tem que ser declarado, declaracao é igual seja onde o artefato estiver sendo definido seja em posição de [ variavel, atributo, método, ], o que pode mudar são adições de elementos chave : [ visibilidade, regra: [mutavel, constante, construcao, staticos: constante_Imutavel_PoloUnico,  ]] #guardaNoCoracao.

- comportamentos_Metodos: se  é algo que precisas fazer já é um verbo e sendo um verbo é um metodo.

- visibilidade: [ + público, # privado, - protegido ]

- o_this: dentro da classe representa a instancia criada fora da classe. ex: dentro da classe é this.campo -- o mesmo fora é instancia.campo

- o tipo de retorno dos métodos é o mesmo das props.

- se um metodo não devolve, seu retorno é vazio, setters não devolvem que faz o trabalho de devolver são os getters.

- setters e getters são para proteger as propsTem de inserções indesejadas.

- getter retorna a propTem

- setter recebe o parâmetro e atribui a propTem, devolveVazio.

- definir_niveis_Cargos:

conceito: quanto mais descer o cargo mais especializado vai ficando e serve para poucos especificos, ex: Dono-Gerente -Funcionario-Fulano1, quanto mais sobe o cargo ou espécie natureza É UM/UMA mais genérico e serve para muitos, ex: sobre Pessoa tudo É uma Pessoa ::

niveis: 1. nível alto: 1°PESSOA, 2. 2° Dono-3° Gerente 3. -4° Funcionario 5°-fulano