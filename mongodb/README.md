# mongodb
Ilustra Spring Boot Data (MongoDB)

## Informações
O arquivo 'application.properties', exibido abaixo, identifica a URI a
ser empregada para a conexão com o MongoDB. Nesse caso, deve estar em execução
no computador local. O banco é 'test' e o usuário 'usurio' com a senha 'senha'.

```
spring.data.mongodb.uri=mongodb://usuario:senha@localhost/test
```

## Passos
- ```mvn spring-boot:run``` coloca a aplicação em execução
- ```curl http://localhost:8080/stocks``` para retornar JSON de conjunto 
de ações (stocks) registradas no SGBD H2. Observe que o 'schema.sql' faz
as inserções.
- ```http://localhost:8080/h2``` oferece acesso ao H2. A URL para acesso ao banco
usado pela aplicação deve ser a mesma daquela contida em 'application.properties'.

