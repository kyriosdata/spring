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

- ```mongod --dbpath <path-to-db>``` Inicia o MongoDB com o banco no diretório 
indicado. Certifique-se de que o diretório existe.
- ```mvn spring-boot:run``` Executa a aplicação.
- ```curl http://localhost:8080/users``` para retornar JSON 
correspondente a um usuário inserido e na sequência recuperado.
- ```mongo``` Execute o cliente para linha de comandos.
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'.


