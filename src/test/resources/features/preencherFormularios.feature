# language: pt

@DesafioWebAlelo
Funcionalidade: Pesquisas de endereços no portal do Correios

Contexto:
Dado que tenha carregado o portal do Correios

@PesquisarCep
Esquema do Cenário: Deve pesquisar um CEP e dar output das informações retornadas. 
Quando efetuar a pesquisa por "<cep>"
Entao sera possivel dar output das informacoes retornadas

Exemplos:
| cep      |
| 25926888 |

@PesquisarLogradouro
Esquema do Cenário: Deve pesquisar um logradouro que retorne mais de um resultado e dar output de todos os dados da tabela retornada. 
Quando efetuar a pesquisa por "<logradouro>"
Entao sera possivel dar output das informacoes retornadas

Exemplos:
| logradouro      |
| Rua 25 de Março |