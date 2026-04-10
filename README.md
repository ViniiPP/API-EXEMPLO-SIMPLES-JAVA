# API REST

Esta é uma API REST simples e funcional desenvolvida para treino
## 🛠️ Tecnologias Utilizadas

* **Java 21**: Versão LTS com recursos modernos, como o uso de `Records` para modelagem de dados limpa e concisa.
* **Spring Boot 3**: Framework focado em produtividade e configuração simplificada.
* **Spring Web**: Dependência principal para a criação das rotas REST e inicialização do servidor Tomcat embutido.
* **Spring Boot DevTools**: Ferramenta para recarregamento automático do servidor durante o desenvolvimento.
* **Maven**: Gerenciador de dependências e build do projeto.

## ⚙️ Funcionalidades (CRUD de Usuários)

A API gerencia uma entidade `Usuario` contendo os atributos `id`, `nome` e `email`.

As seguintes rotas estão disponíveis a partir da URL base `http://localhost:8080/usuarios`:

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| **GET** | `/` | Retorna a lista de todos os usuários cadastrados. |
| **GET** | `/{id}` | Busca e retorna um usuário específico pelo seu ID. |
| **POST** | `/` | Recebe um JSON e cria um novo usuário. |
| **PUT** | `/{id}` | Recebe um JSON e atualiza os dados de um usuário existente. |
| **DELETE** | `/{id}` | Remove um usuário específico da lista pelo seu ID. |

## ▶️ Como executar o projeto

1. Certifique-se de ter o **JDK 21** instalado na sua máquina.
2. Clone este repositório.
3. Abra o projeto em uma IDE (como o IntelliJ IDEA).
4. Aguarde o Maven baixar as dependências automaticamente.
5. Execute a classe principal `MinhaApiApplication`.
6. O servidor iniciará na porta `8080`.

## 🧪 Como testar

Você pode utilizar a ferramenta de requisições `.http` nativa da sua IDE ou softwares de terceiros (como Postman/Insomnia) enviando o corpo das requisições em formato JSON.

**Exemplo de Payload para POST e PUT:**
```json
{
  "id": 1,
  "nome": "Carlos Silva",
  "email": "carlos@email.com"
}