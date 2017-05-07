# jdbc
Ilustra JdbcTemplate e H2 por meio do Spring Framework

## Informações
- Configuração no arquivo 'application.properties'
- Esquema empregado quando SGBD instanciado é 'schema.sql'

## Passos
- ```mvn spring-boot:run``` coloca a aplicação em execução
- Execute 'curl http://localhost:8080/stocks' para retornar conjunto 
de ações (stocks) registradas no SGBD H2.
- Browse 'http://localhost:8080/h2'. Ao optar por conectar, você terá 
acesso ao banco de dados criado pelo esquema e poderá executar sentenças SQL.

