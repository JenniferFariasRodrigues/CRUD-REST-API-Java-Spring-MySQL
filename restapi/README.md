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

* Steps to test this project:
    *  No banco de dados MySQL, por exemplo Workbench. Criar o banco de dados com os dados do application.properties. Criar a tabela: create Database aula;
    * Baixar o aplicativo Advanced REST Client.(https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo/related?hl=pt-BR)
    * Digitar a url segundo o protocolo desejado: GET-buscar, POST-inserir/salvar, PUT-alterar, DELETE-deletar : localhost:8080/contato
####  [1] Protocolo POST: 
 * Para inserir dados, metodo POST.
 * No campo Body troca para application/JSON.
 * Inserir os dados de contato no formato JSON.
Utilizado avatar: https://pixabay.com/pt/illustrations/mulher-avatar-f%c3%aamea-jovem-mulher-1121654/
Abrir em nova guia e copiar endereço de url.
- Formato JSON
* {
    *  "nome":"Jose",
    *  "Telefone":"11 98274-1111",
    * "e-mail": "jennifer@jennifer.farias.com",
    * "urlavatar":"https://cdn.pixabay.com/photo/2016/01/04/21/57/woman-1121654_960_720.png"
*  }
- Clicar em SEND.
- Fig 1 e Fig2: POST

<p align="center">
<img src="https://user-images.githubusercontent.com/69055449/174313031-83cd2453-1c65-475d-8dd1-d9081d8c5c3a.jpeg](https://user-images.githubusercontent.com/69055449/174653560-9db7a623-a403-480c-aa6b-7e38fe2e2da1.jpeg" width="750 /px" alt="accessibility text" />
</p>

####  [2] Protocolo PUT:
- Formato JSON
* {
    * id: 2;
    * "nome":"Jose",
    * "Telefone":"11 98274-1111",
    * "e-mail": "jennifer@jennifer.farias.com",
    *  "urlavatar":"https://cdn.pixabay.com/photo/2016/01/04/21/57/woman-1121654_960_720.png"
*  }
*  Fig 3:PUT

#### [3] Protocolo GET:
*  Somente clicar em SEND para visualizar os dados;
* Também pode colocar no navegador-mesmo comando: localhost:8080/contato
- Fig 4:GET
#### [4] Protocolo DELETE:
* Seleciona o DELETE=> SEND
- Formato JSON
* {
    * id: 2;
    * "nome":"Jose",
    * "Telefone":"11 98274-1111",
    * "e-mail": "jennifer@jennifer.farias.com",
    * "urlavatar":"https://cdn.pixabay.com/photo/2016/01/04/21/57/woman-1121654_960_720.png"
* }
- No banco de dados, clicar em atualizar,fazer a consulta. Visuzalizar que os dados foram excluídos.
- Fig 5 e 6: DELETE
### Running local
- No banco de dados, clicar em atualizar;
- Na tabela, Table=> contato, SELECT * from aula-contato;
- Clicar em Select. Verificar os dados inseridos na tabela do banco de dados.


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
- [1] CRUD REST API Java, Spring, MySQL. Entidade com anotações, Mapeamento, Id e restrições de colunas.  (https://www.youtube.com/watch?v=aEAFpQfcu-0) for more details(https://github.com/heliokamakawa/rest-api-java)
- [2] CRUD REST Java, Spring, MySQL no VS Code. Criando Repository e o REST com todos os detalhes. (https://www.youtube.com/watch?v=e4oyd-8aDCw)
- [3] AULA 03 - Passo a passo para testar o nosso CRUD REST JAVA SPRING MySQL no VS Code. (https://www.youtube.com/watch?v=b_vdrTDakB8)
- [4] Uso do Entity(https://www.devmedia.com.br/jpa-como-usar-a-anotacao-entity/38410)


## REST API image

<p align="center">
<img src="https://user-images.githubusercontent.com/69055449/174313031-83cd2453-1c65-475d-8dd1-d9081d8c5c3a.jpeg" width="750 /px" alt="accessibility text" />
</p>



## Deploying