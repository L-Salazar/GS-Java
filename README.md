
# Alagaqui - Sistema de Monitoramento de Inundações

## 👤 Equipe - Alagaqui

Alexsandro Macedo: RM557068

Leonardo Faria Salazar: RM557484

Guilherme Felipe da Silva Souza: RM558282

## Descrição

**Alagaqui** é uma plataforma colaborativa de monitoramento e mapeamento de inundações em tempo real, desenvolvida para ajudar na prevenção de desastres naturais relacionados a alagamentos em áreas urbanas. A plataforma coleta dados de sensores IoT, como nível de água, taxa de fluxo e obstruções em bueiros, e permite que a comunidade registre e visualize pontos de alagamento em tempo real. A API será usada no aplicativo para cadastrar localizações no mapa pode ocorrer inundações. O app conta também com a função de "Alertas" que podem ser emitidos por prefeituras que queiram fazer parceria com o app.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.6**
- **Spring Data JPA** (para persistência de dados)
- **Oracle Database** (para armazenamento de dados)
- **Swagger** (para documentação da API)
- **Maven** (para gerenciamento de dependências e build)

## Funcionalidades

- **Cadastro de Usuários**: Permite que os usuários se registrem no sistema e visualizem e criem alertas de alagamento.
- **Monitoramento de Sensores IoT**: Sensores são instalados em locais estratégicos para medir o nível da água, taxa de fluxo e identificar obstruções.
- **Visualização em Mapa**: Exibe os dados de alagamento em tempo real, fornecendo um mapa de calor colaborativo.
- **Alertas**: Geração de alertas baseados nas leituras dos sensores e registros de usuários.
- **Swagger UI**: A documentação da API pode ser acessada pelo Swagger UI para facilitar a interação com os endpoints.

## Como Rodar o Projeto

### 1. Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/alagaqui.git
cd alagaqui
```

### 2. Configurar o Banco de Dados

Altere o arquivo `application.properties` para configurar o acesso ao seu banco de dados Oracle. A configuração básica de conexão é a seguinte:

```properties
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
```

### 3. Compilar o Projeto

Use o Maven para compilar o projeto:

```bash
mvn clean package
```

Isso irá gerar um arquivo `.jar` na pasta `target/`.

### 4. Rodar a Aplicação Localmente

Para rodar a aplicação localmente:

```bash
java -jar target/alagaqui-0.0.1-SNAPSHOT.jar
```

Isso vai iniciar a aplicação no `localhost:8080`.

---

## Endpoints da API

### Swagger UI

A documentação da API está disponível no Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

### Endpoints

- **POST /usuarios**: Cria um novo usuário.
- **GET /usuarios/{id}**: Busca um usuário pelo ID.
- **GET /usuarios**: Lista todos os usuários.
- **PUT /usuarios/{id}**: Atualiza um usuário existente.
- **DELETE /usuarios/{id}**: Deleta um usuário.

Repita para as demais entidades como `TipoSensor`, `TipoAlerta`, `SensorIot`, `LeituraSensor`, etc.

---

## Estrutura da API

A API foi organizada de acordo com as boas práticas de design e arquitetura de software, visando a separação de responsabilidades e a manutenção facilitada. A seguir, uma visão geral da estrutura do projeto:

### 1. **Controllers**

Os **Controllers** são responsáveis por expor os endpoints da API. Cada controller mapeia as requisições HTTP e delega a execução para os serviços apropriados. A estrutura dos controllers segue o modelo RESTful.

Exemplo:
- **UsuarioController**: Gerencia as operações relacionadas aos usuários (`POST`, `GET`, `PUT`, `DELETE`).
- **TipoSensorController**: Gerencia os tipos de sensores.

### 2. **Services**

Os **Services** contêm a lógica de negócio e são responsáveis por interagir com os repositórios para manipulação dos dados. Eles atuam como intermediários entre os controllers e os repositórios.

Exemplo:
- **UsuarioService**: Contém as operações de criação, atualização, leitura e exclusão dos usuários.
- **SensorIotService**: Contém a lógica de manipulação de sensores IoT.

### 3. **Repositories**

Os **Repositories** são responsáveis pela persistência de dados, utilizando Spring Data JPA para interagir com o banco de dados. Eles estendem a interface `JpaRepository` e permitem operações CRUD de forma simples.

Exemplo:
- **UsuarioRepository**: Realiza as operações de banco de dados para a entidade `Usuario`.
- **LeituraSensorRepository**: Realiza as operações de banco de dados para as leituras dos sensores IoT.

### 4. **Entities**

As **Entities** representam as tabelas no banco de dados e são mapeadas para objetos Java utilizando JPA (Java Persistence API). Cada tabela do banco de dados tem uma entidade correspondente.

Exemplo:
- **Usuario**: Representa a tabela de usuários.
- **SensorIot**: Representa a tabela de sensores IoT.

### 5. **DTOs (Data Transfer Objects)**

Os **DTOs** são objetos usados para transferir dados entre os componentes da aplicação. Eles ajudam a evitar o uso de entidades diretamente na exposição dos dados, proporcionando maior controle sobre o que é exposto e como é estruturado.

Exemplo:
- **UsuarioDTO**: Objeto usado para transferir os dados do usuário sem incluir a senha ou dados desnecessários.
- **LeituraSensorDTO**: Objeto utilizado para transferir dados das leituras dos sensores IoT.

### 6. **Exceções e Tratamento de Erros**

Para um tratamento adequado de erros, o projeto utiliza exceções personalizadas como `ResourceNotFoundException`, que são lançadas quando um recurso não é encontrado e tratadas de maneira clara para o cliente da API.

### 7. **Swagger**

A API é documentada utilizando o **Swagger**, permitindo a visualização dos endpoints e a interação direta com a API através do Swagger UI. Isso facilita o entendimento da estrutura da API e possibilita testes de maneira intuitiva.

---
