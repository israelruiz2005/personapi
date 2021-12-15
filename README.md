<h2>Digital Innovation: Expert class - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Nesta live coding vamos desenvolver um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

##Teoria
Você sabe o que é API? Essas três letras formam a sigla para Application Programming Interface, que pode ser traduzido como “Interface de Programação de Aplicações”.

As API são conjuntos de instruções e padrões de programação que servem para fornecer dados e informações relevantes de uma determinada aplicação.
Elas utilizam verbos para definir qual é a finalidade da requisição que está sendo enviada. Os verbos são:

**GET**: A requisição é um pedido de dados para a API. A API vai buscar os dados solicitados em algum banco e, provavelmente, vai retornar em formato JSON (formato de notação de objeto JavaScript);

**POST**: Tipo de requisição utilizada para criar um recurso em uma determinada API. São chamados de recursos o objeto que está sendo tratado naquela API.

**PUT**: Requisição utilizada para atualizar o recurso indicado com alguma informação.

**PATCH**: Requisição feita para atualização de somente uma parte de um recurso.

**DELETE**: Requisição para excluir um dado.

São acessadas por meio de Endpoints, que são as URLs nas quais são feitas as requisições. Cada requisição aos endpoints é composta por:

**O método HTTP**

**Cabeçalho requisição**,
- Que pode conter informações como dados de autenticação da API, dados de origem da requisição e formato do retorno.
Embora o corpo da requisição e do retorno possam utilizar outros formatos, de modo geral é utilizado o formato JSON como padrão, tanto para o envio quanto para o retorno das requisições. Esse formato é escolhido, principalmente, por sua compatibilidade simples entre as linguagens e frameworks existentes, tanto de backend quanto de frontend.

##Endpoints no heroku

* [api/v1/people](https://personapi-israel.herokuapp.com/api/v1/people)
- Utilizando aplicativo Postman com o verbo POST
 **localhost:8080/api/v1/people** com a estrutura JSON:
```shell script
  {
    "firstName": "Ninguem",
    "lastName": "Meugnin",
"cpf":"426.220.280-16",
  "phones": [
       {
        "type": "MOBILE",
        "number": "(71)999999999"
       }
     ]
  }
```
- Utilizando aplicativo Postman com o verbo GET
  **localhost:8080/api/v1/people/1** recebemos o JSON:
```shell script
  {
    "id": 1,
    "firstName": "Ninguem",
    "lastName": "Meugnin",
    "cpf": "426.220.280-16",
    "birthDate": null,
    "phones": [
        {
            "id": 1,
            "type": "MOBILE",
            "number": "(71)999999999"
        }
    ]
}
```
O teste acima poderia ser realizado com o endpoit do heroku https://personapi-israel.herokuapp.com/api/v1/people/1


Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```


São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links bem bacanas, sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

[Neste link](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing), seguem os slides apresentados como o roteiro utilizado para o desenvolvimento do projeto da nossa sessão.



