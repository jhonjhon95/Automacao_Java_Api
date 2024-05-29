# Informações de contato:

Linkedin   - [acessar](https://www.linkedin.com/in/jjhon/).<br>
Portfólio  - [acessar](https://jhonjhon95.github.io/portfolio-site/).<br>
Whatsapp   - [acessar](https://api.whatsapp.com/send?phone=5566997218952).<br>
GitHub     - [acessar](https://github.com/jhonjhon95).<br>

# Desafio DB: Testando API

Projeto para garantir cobertura de testes para a API "viacep"

##  Requisitos para execução
* Java 11+ JDK instalado
* Maven configurado no PATH da aplicação
* Allure-Report (instalação automatizada via pom.xml)
* IDE: intellij idea ou VSCode

## Estrutura do projeto

````text
Test-DBTestAPI
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
├── pom.xml
└── README.md
|__.gitignore   
````

## Como executar os testes
Execução através da IDE: É possível selecionar o teste desejado e simplesmente clicar em 'play' no método correspondente
do teste ou pode-se executar pela linha de comando usando o seguinte comando:<br>

Instalar dependências<br>
```bash
mvn clean install 
```
Rodar todos os testes<br>
```bash
mvn test 
```
Rodar Tags
```bash
mvn test -Dgroups="REGRESSAO"
```
Após a execução dos testes será criada na raiz do projeto a pasta "allure-results"

Para gerar o relatório Allure
```bash
mvn allure:report
mvn allure:serve
```
Para rodar localmente e gerar o relatório de uma só vez rodar o comando:
```bash
mvn clean test; mvn allure:report; mvn allure:serve
```

# Plano de Teste e Estratégia de Testes.

## Introdução

- Este plano descreve a estratégia de testes para a API de Consultas de Ceps válidos e inválidos, visando garantir a cobertura de testes, identificar e corrigir bugs, e assegurar que a aplicação atende aos requisitos.

  ## Objetivos do Teste

- Validar a funcionalidade da API.
- Garantir robustez e confiabilidade.
- Identificar e corrigir bugs.
- Assegurar conformidade com a documentação técnica.
- Verificar usabilidade e qualidade do código.

  ## Escopo do Teste

- Funcionalidades a Testar: Consultar Cep.

  ## Abordagem de Teste

- Testes Funcionais: Validar funcionalidades conforme os requisitos.
- Testes de Contrato: Verificar conformidade com contratos de API.
- Testes de Regressão: Assegurar que novas alterações não impactem funcionalidades existentes.