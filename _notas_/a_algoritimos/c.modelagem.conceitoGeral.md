# Modelagem Conceito Geral

# MODELAGEM
1. conceito: #modelagem sempre comece modelando entidade que não tem #associacao com outra, assim quando for para as que usam outras essas já estariam disponíveis.

1. modelagemDados
  1. associacao_Propriedade: narracao: TEM UM , ex: campo1, campo2, metodo()1
  2. associacao_Heranca: narracao: É UM , ex: Funcionário é uma Pessoa então pode herdar dela.,
  1. associacao_Heranca_EntreModeladoras: palavraChave : [ extends, ]

# DEFINIR NIVEIS CARGOS
definir_niveis_Cargos:
  1. conceito: quanto mais descer o cargo mais especializado vai ficando e serve para poucos especificos, ex: Dono-Gerente -Funcionario-Fulano1, quanto mais sobe o cargo ou espécie natureza É UM/UMA mais genérico e serve para muitos, ex: sobre Pessoa tudo É uma Pessoa ::

  2.  niveis:
    1. nível alto: 1°**PESSOA**,
    2. 2° Dono-3° Gerente
    3. -4° Funcionario 5°-fulano