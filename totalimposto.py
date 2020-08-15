custo_projeto = float(input( "Qual o Valor do Projeto ?: R $:" ))
taxa_iss_municipal = custo_projeto * 0,04
taxa_icms_estadual = custo_projeto * 0,18
custo_projeto_final = taxa_iss_municipal + taxa_icms_estadual
print("O Custo final do Projeto com todos os impostos é: R $" , "% .2f" ( custo_projeto_final , 2 ))
