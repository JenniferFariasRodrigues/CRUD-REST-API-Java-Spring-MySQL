# Projeto CRUD REST API Java, Spring, MySQL
This project aims to be a building block for several lambdas and other services.s

## Development Requirements

Requirements:



## Development steps:

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados MySQL
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções 

### Running tests



### Running local



### Directory tree

* [infrastructure](./infrastructure) -> contains terraform projects
    * [cloud]
        * [**content**](./infrastructure/cloud)
    * [components]
        * [**content**](./infrastructure/components)
    * [local]
        * [**content**](./infrastructure/local)


### Frequently asked question

- If two+ git branches generate migrations from `master`, they can conflict?
    - They will. Alembic is simple, every migration are chained to the previous one,
      having two migrations pointing to the same `down_revision` is forbidden and will happens in this scenario
      If your change are not actually conflicting (they do not change the same table/column) when merging you can just fix the `chain`.
      Example: if `branch-A` and `branch-B` generate migrations from `master`
      when merging you will have to choose `master -> a -> b` or `master -> b -> a`.
      Don't freak out about it, any inconsistent migrations will not be applied and alembic will let you know.

**API Reading**
- [1] CRUD REST API Java, Spring, MySQL. Entidade com anotações, Mapeamento, Id e restrições de colunas.  (https://www.youtube.com/watch?v=aEAFpQfcu-0) for more
- [2] CRUD REST Java, Spring, MySQL no VS Code. Criando Repository e o REST com todos os detalhes. (https://www.youtube.com/watch?v=e4oyd-8aDCw)
- [2] AULA 03 - Passo a passo para testar o nosso CRUD REST JAVA SPRING MySQL no VS Code. (https://www.youtube.com/watch?v=b_vdrTDakB8)

## Deploying

Exists two kinds of deployment in this project:





