
# Spring Boot 3: desenvolva uma API Rest em Java

API rest com Spring Boot, desenvolvido com Flyway como ferramenta de Migrations da API, e CRUDs utilizando o banco de dados MySQL.

O foco do projeto é criar uma aplicação com recursos médicos, onde podemos adicionar e deletar médicos do cadastro, assim como alterar seus dados. Ou seja, desenvolver um CRUD de uma API Rest usando o Spring Boot.

## Etapa II
- ajustes na classe controller, para seguir as boas práticas do protocolo HTTP quanto ao retorno dos códigos HTTP e das respostas que a API devolve.
- personalizar retornos para tratar erros da melhor forma possível.
- na API precisamos ter um código que permite o usuário se autenticar, e também ter um controle de acesso de informações públicas e privadas.

- Aprenderemos a aplicar isso com o Spring Security, sendo um módulo do Spring responsável por monitorar esse controle.
- usaremos a autenticação fundamentada em tokens com o padrão JSON Web Token (JWT).


## Ideia de FrontEnd

![img.png](img.png)

Trabalharemos em um projeto de uma clínica médica fictícia. Temos uma empresa chamada Voll Med, que possui uma clínica que precisa de um aplicativo para monitorar o cadastro de médicos, pacientes e agendamento de consultas.

Será um aplicativo com algumas opções, em que a pessoa que for usar pode fazer o CRUD, tanto de médicos quanto de pacientes e o agendamento e cancelamento das consultas.


## Tecnologias utilizadas:

- Spring Boot 3
- Java 17
- Lombok
- MySQL/ Flyway
- JPA/Hibernate
- Maven
- Insomnia
- Tokens JWT



