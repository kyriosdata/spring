# mongodb
Ilustra Spring Boot Data (MongoDB)

## Informações
As informações para conexão com o MongoDB são fornecidas pelo arquivo 
'[application.properties](src/main/resources/application.properties)'. 
Consulte este arquivo para detalhes.

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
  Para o banco 'test' (selecionado pelo comando acima), cria o usuário com 
  a devida permissão para viabilizar o uso da URL de conexão (fornecida no início desse documento).
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'. Possivelmente
  nenhum será exibido nesse instante.
- ```mvn spring-boot:run``` Executa a aplicação.
- ```curl http://localhost:8080/users``` para retornar JSON 
correspondente a um usuário inserido e na sequência recuperado. Por 
exemplo ```{"id": 123, "nome":"fábio"}```.
- ```mongo``` Execute o cliente para linha de comandos.
  - ```db.usuario.find({})``` Lista todos os documentos na coleção 'usuario'. Após a execução
  do comando anterior, pelo menos um documento deve ser recuperado.


