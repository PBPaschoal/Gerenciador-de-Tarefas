# Gerenciador de Tarefas

Este repositório contém um sistema completo de Gerenciamento de Tarefas, composto por um frontend desenvolvido em Angular e um backend utilizando Spring Boot. O objetivo deste projeto é permitir a criação, edição, exclusão e listagem de tarefas de forma simples e eficiente, demonstrando boas práticas de desenvolvimento e integração entre frontend e backend.

## Estrutura do Projeto

A estrutura do repositório é organizada da seguinte forma:

Gerenciador-de-Tarefas/
├── README.md
├── PROJETO_ANGULAR/
│   └── (arquivos do Angular)
├── API_REST/
│   ├── .metadata/
│   ├── todolist/ (projeto Spring Boot)



### Pastas Principais

- PROJETO_ANGULAR/: Contém o código-fonte do frontend, desenvolvido com Angular.

- API_REST/: Contém o backend da aplicação, desenvolvido com Java e Spring Boot.

## Tecnologias Utilizadas

### Frontend (Angular)

- Linguagem: TypeScript

- Framework: Angular

- Ferramentas adicionais: Bootstrap

### Backend (Spring Boot)

- Linguagem: Java

- Framework: Spring Boot

- Banco de Dados: H2 Database (por enquanto)

- Ferramentas de Teste: Postman para testar as rotas da API

## Funcionalidades da API REST

A API REST suporta as seguintes operações:

- GET /tasks: Retorna a lista de tarefas.

- GET /tasks/{id}: Retorna uma tarefa específica pelo ID.

- POST /tasks: Cria uma nova tarefa.

- PUT /tasks/{id}: Atualiza uma tarefa existente.

- DELETE /tasks/{id}: Remove uma tarefa pelo ID.

### Como Executar o Backend

1.Certifique-se de ter o Java instalado.

2.Importe o projeto no IntelliJ IDEA, Eclipse ou outra IDE compatível. No meu caso é a Spring Tool Suite 4.

3.Execute o arquivo principal da aplicação (classe com @SpringBootApplication).

4.O servidor será iniciado no endereço http://localhost:8080.

## Funcionalidades do Frontend

O frontend se comunica com a API REST para realizar as operações de **CRUD** (Criar, Ler, Atualizar e Deletar) de tarefas.

### Como Executar o Frontend

1.Certifique-se de ter o Node.js e o Angular CLI instalados.

2.Navegue até a pasta PROJETO_ANGULAR no terminal.

3.Execute o comando npm install para instalar as dependências.

4.Inicie o servidor de desenvolvimento com o comando ng serve.

5.Acesse o frontend em http://localhost:4200.

## Conexão entre Frontend e Backend

Certifique-se de que o backend (API REST) está em execução antes de utilizar o frontend. O frontend foi configurado para enviar requisições para http://localhost:8080.

## Testando a API com Postman

1.Importe a coleção de testes do Postman disponível neste repositório.

2.Configure o Postman para enviar requisições para http://localhost:8080.

3.Teste as rotas mencionadas na seção "Funcionalidades da API REST".

## Futuras Implementações

- Autenticação e autorização de usuários.

- Melhorias na interface do usuário.

- Integração com um banco de dados em produção (MySQL, PostgreSQL, etc.).

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## NOTA:
Eu procuro desenvolver meus projetos de forma independente, para praticar e consolidar meu aprendizado. No entanto, como ainda sou iniciante no desenvolvimento de APIs, contei com o apoio do ChatGPT para elaborar este projeto. Assim, consigo, na prática, entender, me familiarizar, testar, errar e aprender como funciona uma API REST. Este projeto é um passo importante no meu processo de evolução como desenvolvedor.
@pbpaschoal