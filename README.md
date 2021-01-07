# Sobre a Alelo

A Alelo é uma empresa de serviços financeiros, especializada em benefícios, incentivos e gestão de despesas corporativas, que tem como objetivo facilitar o dia a dia das pequenas, médias e grandes empresas, bem como de estabelecimentos comerciais parceiros da sua rede de aceitação.

Fundada em 2003 pelo banco CBSS (Companhia Brasileira de Soluções e Serviços), a companhia hoje pertence ao Grupo Elopar, holding fruto de uma parceria do Banco do Brasil com o Bradesco.

Ao longo de sua trajetória, a instituição passou a atuar em novos mercados, e hoje conta com um amplo portfólio de soluções voltadas aos segmentos de alimentação, mobilidade, cultura, saúde e premiação.

O Alelo Frota, que é uma plataforma que gerencia todas as suas despesas automotivas como combustível, manutenção e documentação. Você define os parâmetros de utilização e controla como e onde os seus cartões podem ser utilizados, proporcionando redução de custos para a sua operação e melhor performance para a sua frota.


**O desafio de automação do Alelo Frota consiste em duas partes, uma de Automação WEB e outra de Automação de API. Desejamos boa sorte!**


# Parte 1 - DESAFIO AUTOMAÇÃO - WEB #

# Introdução 

Elaborar os testes de automação abaixo e disponibilizar em repositório web, aberto ao público:
1) No site dos correios, pesquisar um CEP e dar output das informações retornadas.
2) No site dos correios, pesquisar um logradouro que retorne mais de um resultado e dar output de todos os dados da tabela retornada.

# Tecnologias requeridas
-	Java
-	Selenium webdriver
-	Cucumber a

# **O que gostaríamos de ver neste desafio**
1.BDD
2. Escrita dos cenários
3. Reutilização dos Gherkins
4. Legibilidade
5. Estrutura do projeto

# **O que será avaliado**
1.Código fonte
 -	Boas práticas de programação
 -	Padrões de projeto

2.Testes 
 -	Cobertura dos cenários
 -	Execução
 -	Report

# **Envio do desafio**
- Criar repositório web aberto ao público: desafio-web-alelo-{nome do participante}

# **O que será avaliado**
1.Código fonte
 -	Boas práticas de programação
 -	Padrões de projeto

2.Testes integrados
 -	Cobertura dos cenários
 -	Execução
 -	Report
	
3.Build do projeto com os testes integrados

# Lucas Bonanno Casanova 

### https://www.linkedin.com/in/lucas-bonanno-casanova-automation-qa/

### Estrutura
É um Projeto Maven baseado na técnica de desenvolvimento BDD (Behavior Driven Development). Desenvolvido em Java e Gherkin com framework Selenium e as ferramentas JUnit e Cucumber. 

### Instalação
Clonar o projeto do repositório para ter acesso. Executar o comando no terminal:
```sh
$ git clone https://github.com/LucasBonanno/desafio-web-alelo-lucas-bonanno-casanova
```
**Observações:**
 - É necessário ter o plugin do Cucumber intalado na IDE

### Execução dos Casos de Testes
A **RunCucumberTest.class** foi estruturada para ser o disparador. 
Para executar basta alimentar a opção "tags" da anotação @CucumberOptions da classe executora.
Exemplo:
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "br.com.alelo.teste",
        **tags = {"@Tags"},** 
		plugin = {"pretty", "html:evidences/report-html", "json:evidences/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)

A classe executora está em: **/src/test/java/br/com/alelo/teste/runner/RunCucumberTest.java**

Os Casos de Testes estão em:
**/src/test/resources/features**

Para selecionar o browser que será utilizado para execução dos Casos de Testes é necessário alterar o enum Browser da Propriedades.class em: 
**/src/test/java/br/com/alelo/core/Propriedades.java**
Exemplo:
- Utilizando o browser Chrome
  public static Browser browser = Browser.CHROME;

### Plugins e Drivers

| Plugin | Link |
| ------ | ------ |
| Cucumber Eclipse | https://marketplace.eclipse.org/content/cucumber-eclipse-plugin |
| Cucumber Intellij | https://plugins.jetbrains.com/plugin/7212-cucumber-for-java|
| Chrome Drive | https://chromedriver.chromium.org/getting-started |
| FireFox Drive | https://github.com/mozilla/geckodriver/releases |