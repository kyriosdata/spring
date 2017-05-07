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
- ```mongod --dbpath db``` Inicia o MongoDB com o banco no diretório 
criado. Observe que 'db' deve ser substituído pelo diretório adequado caso
o comando não seja executado no mesmo diretório que o ```mkdir```.
- ```mongo``` Execute o cliente para linha de comandos. Será necessário criar
o usuário 'usuario' com a senha 'senha', conforme a URI fornecida acima para 
conexão com o MongoDB.
  - ```use test``` seleciona o banco 'test'.

  - ```db.createUser({ user: "usuario", pwd: "senha", roles: [ "readWrite"] })```
  Seleciona o banco 'test' (default) e para o mesmo, cria o usuário
       indicado.
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'. Possivelmente
  nenhum será exibido nesse instante.
- ```mvn spring-boot:run``` Executa a aplicação.
- ```curl http://localhost:8080/users``` para retornar JSON 
correspondente a um usuário inserido e na sequência recuperado. Por 
exemplo ```{"id": 123, "nome":"fábio"}```.
- ```mongo``` Execute o cliente para linha de comandos.
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'. Após a execução
  do comando anterior, pelo menos um documento deve ser recuperado.


