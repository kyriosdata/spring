# data
Ilustra uso de JPA com auxílio do Spring Framework

## Informações
O arquivo 'application.properties' é fornecido transcrito abaixo.

```
spring.jpa.hibernate.ddl-auto=create-drop

spring.datasource.url=jdbc:h2:mem:test

spring.h2.console.enabled=true
spring.h2.console.path=/h2

```

A primeira linha indica que é para ser criado o esquema, após "drop" das tabelas 
em questão, ou seja, é opção exclusiva para testes.

A segunda linha indica o uso do SGBD H2 (in-memory), ou seja, estará disponível
via console, configurado nas duas linhas seguintes, apenas enquanto a aplicação
estiver em execução.

## Passos
- ```mvn spring-boot:run``` coloca a aplicação em execução
- ```curl http://localhost:8080/create``` para criar uma entrada na tabela
USUARIOS (chave é um valor gerado aleatoriamente).
- ```http://localhost:8080/h2``` oferece acesso ao H2. A URL para acesso ao banco
usado pela aplicação deve ser a mesma daquela contida em 'application.properties'.

