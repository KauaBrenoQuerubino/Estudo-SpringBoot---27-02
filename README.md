# Spring Boot API com MySQL

Este é um projeto de API desenvolvido em **Spring Boot** que utiliza **MySQL** como banco de dados.

## 🚀 Tecnologias Utilizadas

- **Java 23+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## 📌 Configuração do Banco de Dados

Antes de executar o projeto, siga estas instruções para configurar o **MySQL** corretamente:

1. Certifique-se de que o MySQL está instalado e rodando.
2. Crie um schema no MySQL com o nome **api_spring**:
   ```sql
   CREATE DATABASE api_spring;
   ```
3. No arquivo **`src/main/resources/application.properties`**, configure as credenciais do banco de dados:

   ```properties
   spring.application.name=Produtos
   # Porta onde o Tomcat será executado
   server.port=8090

   # Informações para conexão com o banco de dados MySQL
   spring.datasource.url=jdbc:mysql://localhost/api_spring?useTimezone=true&serverTimezone=UTC
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   # Manipulação da estrutura do banco de dados
   spring.jpa.hibernate.ddl-auto=update
   ```

   Substitua `SEU_USUARIO` e `SUA_SENHA` pelas credenciais corretas do MySQL.

## 💪 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/KauaBrenoQuerubino/Estudo-SpringBoot---27-02
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd Estudo-SpringBoot---27-02
   ```
3. Compile e execute o projeto usando Maven:
   ```bash
   Execute ProdutosApplication.java
   ```
4. A API estará disponível em:
   ```
   http://localhost:8090
   ```

## 🛠 Endpoints Disponíveis

| Método | Endpoint           | Descrição                     |
|--------|-------------------|------------------------------|
| GET    | `/api/usuarios`   | Lista todos os usuários      |
| POST   | `/api/usuarios`   | Cria um novo usuário        |
| GET    | `/api/usuarios/{Codigo}` | Obtém um usuário por Codigo   |
| PUT    | `/api/usuarios/{Codigo}` | Atualiza um usuário por Codigo |
| DELETE | `/api/usuarios/{Codigo}` | Remove um usuário por Codigo  |

## 📌 Autor

Desenvolvido por **Kaua Breno**.

Se gostou do projeto, dê uma ⭐ no repositório!

## 📢 Observação

- Certifique-se de que o MySQL está rodando antes de iniciar a API.
- O Spring Boot irá criar as tabelas automaticamente no schema **api_spring** com base nas entidades definidas.

