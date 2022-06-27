# Automação Swag Labs

Desafio de automação de teste realizado para processo seletivo voltado a posição de QA Junior na empresa i.Systems, onde o objetivo é validar se o login efetuado, a inclusão de um produto ao carrinho e o logout estão sendo executados com sucesso.

#### Importante
Para que o teste seja executado com sucesso é necessário instalar as ferramentas listadas no final deste documento.

# Instruções
### Clone do Repositório

Após a instalação de todas as ferramentas, vamos ao clone do projeto swaglabsAutomationWeb para um repositório local.

1) Abra a pasta onde deseja que o repositório seja clonado;

2) Pressione o botão direto do mouse em qualquer campo vazio da pasta e clique na opção “Git Bash Here”;

3) Para clonar o diretório digite **git clone** e cole a URL do repositório, assim:

$ git clone https://github.com/fhbtst/swaglabsAutomationWeb.git

4) Pressione enter para criar o clone do projeto no seu diretorio local.

## Configurando o ambiente para execução

1) Verifique qual versão do Chrome instalada;

1.1 Na parte superior direita do Chrome selecione o menu através do icone **︙ > ajuda > sobre o Google Chrome** e verifique a versão;

2) Faça o download do Chrome Driver de acordo com a versão do seu navegador Chrome e extraia no diretorio desejado (lembre-se do caminho desse diretório);

3) Configure o caminho do Chrome Driver dentro do código fonte no projeto:

3.1 Abra o Intellij;

3.2 Selecione a opção Open;

3.3 Navegue até o diretório onde foi realizado o clone do projeto e o selecione;

3.4 Pressione Ok;

3.5 No menu Project navegue entre as pastas: **src > test > java > módulos/login**;

3.6 Clique duas vezes em LoginTest para abrir;

3.7 Onde foi declarado @BeforeEach deve constar o caminho onde o Chrome Driver foi extraído com o nome do arquivo executável (.exe), no caso do exemplo abaixo o caminho era “C:\Drivers\Chrome Driver 103.0.5060.53” e o nome do arquivo "chromedriver".

![Código Fonte onde mostra o caminho do WebDriver](https://i.postimg.cc/G21Mn5vx/before-Each.png)

### Executando o Teste
Após o download do chrome driver e o apontamento do caminho no código fonte, vamos executar.

1) No menu Project navegue entre as pastas: **src > test > java > módulos > login**;

2) Clique com botão direito do mouse em LoginTest e selecione a opção “Run LoginTest”.

OBS: É possível utilizar o atalho de teclado “Ctrl + Shift + F10” para execução.

## Ferramentas Utilizadas

- [Chrome](https://www.google.com/intl/pt-BR/chrome/)

- [Chrome Driver](https://chromedriver.chromium.org/downloads)

- [Git](https://git-scm.com/downloads)

- [Intellij IDEA 2022.1.1](https://www.jetbrains.com/idea/download/other.html)

- [Java 18](https://www.oracle.com/java/technologies/downloads/#jdk18-windows)

#### Dependências Utilizadas

- [JUnit Jupiter 5.9.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.9.0-M1)

- [Selenium 4.2.2](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.2.2)
