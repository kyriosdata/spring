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
- ```mkdir db``` Cria diretório 'db' a ser utilizado pelo MongoDB.
- ```mongod --dbpath <path-to-db>``` Inicia o MongoDB com o banco no diretório 
criado.
- ```mongo``` Execute o cliente para linha de comandos. Será necessário criar
o usuário 'usuario' com a senha 'senha', conforme a URI fornecida acima para 
conexão com o MongoDB.
  - ```use test
       db.createUser(
          {
            user: "usuario",
            pwd: "senha",
            roles: [ "readWrite" ]
          }
       )``` 
  Seleciona o banco 'test' (default) e para o mesmo, cria o usuário
       indicado.
- ```mvn spring-boot:run``` Executa a aplicação.
- ```curl http://localhost:8080/users``` para retornar JSON 
correspondente a um usuário inserido e na sequência recuperado.
- ```mongo``` Execute o cliente para linha de comandos.
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'.


