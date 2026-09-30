# 💻 Client CRUD API

API RESTful desenvolvida para o cadastro e gerenciamento de clientes. Este projeto demonstra o desenvolvimento de uma aplicação backend utilizando o ecossistema Spring, aplicando conceitos como padrão DTO, arquitetura em camadas (Controller, Service, Repository) e validação de dados.

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.2** (Web, Data JPA, Validation)
- **H2 Database** (Banco de dados em memória para testes e desenvolvimento)
- **Maven** (Gerenciamento de dependências)

## ⚙️ Funcionalidades
- **CRUD Completo:** Criação, leitura, atualização e exclusão de clientes.
- **Padrão DTO (Data Transfer Object):** Isolamento entre a camada de apresentação e o modelo de domínio.
- **Validação de Dados:** Uso do Bean Validation (`@NotBlank`, `@Positive`, etc.) para garantir a integridade das requisições.
- **Ambientes Isolados:** Configuração de *profiles* do Spring (ex: perfil `test`) para separar as configurações de desenvolvimento e produção.

## 🚀 Como Executar o Projeto

1. Clone o repositório:
```bash
git clone [https://github.com/Caua-Cosenza/CRUD_Client.git](https://github.com/Caua-Cosenza/CRUD_Client.git)
Entre na pasta do projeto:

Bash
cd CRUD_Client
Execute a aplicação usando o Maven Wrapper:

Bash
./mvnw spring-boot:run
A API estará disponível em http://localhost:8080.

Para acessar o banco de dados H2, acesse http://localhost:8080/h2-console (a URL JDBC configurada é jdbc:h2:mem:testdb).

👨‍💻 Autor
Desenvolvido por Cauã Cosenza
