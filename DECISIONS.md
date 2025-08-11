## Sumário
1. [Visão Geral](#visão-geral)
2. [Decisões Técnicas](#decisões-técnicas)
   - [1. Escolha da Linguagem](#escolha-da-linguagem)
   - [2. Frameworks e Bibliotecas](#frameworks-e-bibliotecas)
   - [3. Estrutura do Projeto](#estrutura-do-projeto)
   - [4. Banco de Dados](#banco-de-dados)
   - [5. Docker e Contêineres](#docker-e-contêineres)
   - [6. Testes e Qualidade do Código](#testes-e-qualidade-do-código)
3. [Referências](#referências)

## Visão Geral
Este documento detalha as principais decisões técnicas tomadas durante o desenvolvimento do projeto FILMES API. O objetivo é fornecer um registro claro das escolhas feitas e suas justificativas.

## Decisões Técnicas

### 1. Escolha da Linguagem
*Decisão:* Utilizamos Java para o backend e JavaScript (React) para o frontend.

*Justificativa:* 
- Java é uma linguagem robusta e amplamente utilizada em aplicações empresariais, oferecendo um ecossistema rico e uma forte comunidade de suporte.
- React foi escolhido para o frontend devido à sua capacidade de criar interfaces de usuário dinâmicas e responsivas, além da sua popularidade e suporte.

### 2. Frameworks e Bibliotecas
*Decisão:* Usamos Spring Boot para o backend e Axios para requisições HTTP no frontend.

*Justificativa:*
- Spring Boot facilita a criação de aplicações Java, oferecendo uma configuração mínima e suporte a microserviços.
- Axios é uma biblioteca popular para realizar requisições HTTP, com uma API simples e suporte a promessas.

### 3. Estrutura do Projeto
*Decisão:* Organizei o código em pastas distintas para o backend e o frontend.

*Justificativa:*
- Essa separação ajuda na organização do projeto, permitindo que equipes trabalhem em paralelo sem conflitar.
- Facilita a implementação de contêineres Docker separados para cada parte do aplicativo.

### 4. Banco de Dados
*Decisão:* Escolhemos PostgreSQL como banco de dados.

*Justificativa:*
- PostgreSQL é um banco de dados relacional robusto, com suporte a transações e integridade referencial, adequado para aplicações que requerem persistência de dados complexos.

### 5. Docker e Contêineres
*Decisão:* Usamos Docker para contêinerizar a aplicação.

*Justificativa:*
- A contêinerização facilita a implantação e a escalabilidade, garantindo que a aplicação funcione em ambientes consistentes.
- Permite que os desenvolvedores testem em um ambiente similar ao de produção.

### 6. Testes e Qualidade do Código
*Decisão:* Implementamos testes unitários com JUnit para o backend e Jest para o frontend.

*Justificativa:*
- Testes automatizados garantem que as funcionalidades do aplicativo estejam funcionando conforme o esperado e ajudam a evitar regressões.

## Referências
- Documentação do [Spring Boot](https://spring.io/projects/spring-boot)
- Documentação do [React](https://reactjs.org/)
- Documentação do [PostgreSQL](https://www.postgresql.org/docs/)
- Documentação do [Docker](https://docs.docker.com/)