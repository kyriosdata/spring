# jdbc
Ilustra JdbcTemplate e H2 por meio do Spring Framework

## Informações
- Configuração no arquivo 'application.properties'
- Esquema empregado quando SGBD instanciado é 'schema.sql'

## Passos
- ```mvn spring-boot:run``` coloca a aplicação em execução
- ```curl http://localhost:8080/stocks``` para retornar JSON de conjunto 
de ações (stocks) registradas no SGBD H2. Observe que o 'schema.sql' faz
as inserções.
- ```http://localhost:8080/h2``` oferece acesso ao H2. A URL para acesso ao banco
usado pela aplicação deve ser a mesma daquela contida em 'application.properties'.

