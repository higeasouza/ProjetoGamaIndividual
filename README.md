![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)
![](https://img.shields.io/badge/maven-v.3.3-orange.svg)

# Projeto Final: Academia QA 4.0 

Autora: <br>
- [![Linkedin Badge](https://img.shields.io/badge/-Higea-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/higeasouza/)](https://www.linkedin.com/in/higeasouza/)[Higea Celly Souza Barbosa](https://github.com/higeasouza)

# Descrição do desafio 
### Criar uma aplicação Selenium com os seguinte caso de teste
### Caso de teste 1
Acessar o site da Tricentis e preencher os dados necessários para requerimento de seguro<br>

<b>Cenário</b>: Preencher as informacoes necessarias <br>
Preencher todos os campos da aba “Enter Vehicle Data” e pressionar next<br>
Preencher todos os campos da aba “Enter Insurant Data” e pressionar next.<br>
Preencher todos os campos da aba “Enter Product Data” e pressionar next.<br>
Preencher todos os campos da aba “Select Price Option” e pressionar next.<br>
Preencher todos os campos da “Send Quote” e pressionar Send.<br>
Verificar a mensagem “Sending e-mail success!” na tela.<br>

--------------------------------------------------------------------
## Dependencias
- Projeto Java do repo abaixo rodando no site da Accenture<br>
http://sampleapp.tricentis.com/101/app.php <br>
Link do repositório: https://github.com/higeasouza/ProjetoGamaIndividual <br>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/higeasouza/ProjetoGamaIndividual
 ```

- Entrando na pasta do projeto
 ```bash
cd ProjetoGamaIndividual
 ```

- Configurando selenium em seu computador<br>
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- higea<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br>
    |  |  |  |  |  |-- TricentisTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- higea<br>
    |  |  |  |  |  |-- TricentisTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>
