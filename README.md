<h1 align="center"> 📝 Todo List API - Teste Java Júnior </h1>

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/Ivaneudo/TesteJavaJunior-TodoList">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Ivaneudo/TesteJavaJunior-TodoList">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/Ivaneudo/TesteJavaJunior-TodoList">
  <a href="https://github.com/Ivaneudo/TesteJavaJunior-TodoList/blob/main/LICENSE">
    <img alt="GitHub license" src="https://img.shields.io/github/license/Ivaneudo/TesteJavaJunior-TodoList">
  </a>
</p>

<p align="center">
  <a href="#-sobre-o-projeto">Sobre</a> •
  <a href="#-tecnologias">Tecnologias</a> •
  <a href="#-funcionalidades">Funcionalidades</a> •
  <a href="#-como-executar">Como Executar</a> •
  <a href="#-endpoints-da-api">Endpoints</a> •
  <a href="#-documentação-swagger">Documentação</a> •
  <a href="#-autor">Autor</a>
</p>

---

## 💻 Sobre o Projeto

Esta é uma API RESTful para gerenciamento de tarefas (**To-Do List**), desenvolvida como projeto de estudo. A aplicação permite criar, listar, atualizar e deletar tarefas, servindo como um exemplo prático de uma API completa com operações de CRUD, validações e persistência em banco de dados.

O projeto foi construído com **Spring Boot** e segue boas práticas de desenvolvimento, incluindo a separação em camadas (Controller, Service, Repository) e o uso de um banco de dados PostgreSQL para persistência.

---

## 🛠 Tecnologias

As principais tecnologias e ferramentas utilizadas no projeto são:

*   **[Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)** - Linguagem de programação.
*   **[Spring Boot 4.0.3](https://spring.io/projects/spring-boot)** - Framework para simplificar a criação de aplicações Spring.
*   **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - Abstração para a camada de persistência com Hibernate.
*   **[PostgreSQL](https://www.postgresql.org/)** - Banco de dados relacional utilizado em produção/desenvolvimento.
*   **[H2 Database](https://www.h2database.com/)** - Banco de dados em memória para execução de testes.
*   **[Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)** - Módulo para criação de APIs REST.
*   **[Spring WebFlux](https://docs.spring.io/spring-framework/reference/web/webflux.html)** - Módulo reativo, utilizado para testes com `WebTestClient`.
*   **[Spring Boot Validation](https://spring.io/guides/gs/validating-form-input/)** - Para validação de dados de entrada com Bean Validation.
*   **[Springdoc OpenAPI (Swagger)](https://springdoc.org/)** - Para geração automática da documentação da API.
*   **[Maven](https://maven.apache.org/)** - Ferramenta de gerenciamento de dependências e build.

---

## ⚙ Funcionalidades

- [x] Criar uma nova tarefa.
- [x] Listar todas as tarefas cadastradas.
- [x] Buscar uma tarefa específica por ID.
- [x] Atualizar os dados de uma tarefa existente.
- [x] Deletar uma tarefa do sistema.
- [x] Validação de campos obrigatórios (ex: nome da tarefa).
- [x] Documentação interativa da API com Swagger.

---

## 🚀 Como Executar

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:

*   [Git](https://git-scm.com)
*   [Java JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
*   [PostgreSQL](https://www.postgresql.org/download/) (ou usar o Docker)
*   Uma IDE de sua preferência (recomendo [IntelliJ IDEA](https://www.jetbrains.com/idea/download/))

### 🎲 Rodando o Backend (Servidor)

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Ivaneudo/TesteJavaJunior-TodoList.git
    
2. **Acesse o projeto:**
    ```bash
   cd TesteJavaJunior-TodoList
   
3. **Configure o Banco de Dados PostgreSQL:**
   - Crie um banco de dados com o nome java_todolist (ou o nome que preferir).

   - Atualize o arquivo src/main/resources/application.properties com as credenciais do seu banco (usuário e senha). Exemplo:

    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/java_todolist
    spring.datasource.username=postgres
    spring.datasource.password=sua_senha

4. **Execute a aplicação via Maven Wrapper:**

    ```bash
    ./mvnw spring-boot:run