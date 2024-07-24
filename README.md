# Catálogo de restaurantes
## Desafio anota ai

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

Esse projeto é uma construção de API usando **Java, Java Spring, AWS Simple Queue Service, Mongo DB e AWS Simple Storage Service.**

## Tabela de conteúdos

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)

## Instalação

1. Copie o repositório:

```bash
git clone https://github.com/OliverBR1/Desafio-Anota-ai.git
```

2. Instalar dependências do Maven

3. Crie uma configuração na sua variavéis de ambiente com as suas credencias da AWS que vão ser utilizada no `application.properties`

```yaml
aws.region=us-east-1
aws.accessKeyId=${AWS_KEY_ID}
aws.secretKey=${AWS_SECRET}
```

**Config Values**

```yaml
AWS_KEY_ID=VALUE;AWS_SECRET=VALUE2
```

**Mongo**

1. Digite no terminal:
```bash
docker compose up -d
```

2. Crie um Banco de dados no mongo utilizando mongo express: http://localhost:8081.

3. Logue com suas credencias e crie um banco de dados com o nome 'product-catalog'.

## Uso

1. Execute a aplicação no Maven
2. A Api é acessada nesse caminho http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

**API PRODUCT**
```markdown
POST /api/product - Criar um novo produto
GET /api/product - Receber todos os produtos
PUT /api/product/{id} - Atualizar um produto
DELETE /api/product/{id} - Excluir um produto
```

**BODY**
```json
{
  "title": "Produto para postar no tópico",
  "description": "",
  "ownerId": "4444444",
  "categoryId": "659d558b0304df732ddd4587",
  "price": 10000
}
```

**API CATEGORY**
```markdown
POST /api/category - Criar uma nova categoria
GET /api/category - Receber todas as categorias
PUT /api/category/{id} - Atualizar uma categoria
DELETE /api/category/{id} - Excluir uma categoria
```

**BODY**
```json
{
  "id": "393948882828",
  "title": "Teste",
  "description": "",
  "ownerId": "4444444"
}
