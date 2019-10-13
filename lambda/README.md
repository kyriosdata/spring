## Microserviço "Mínimo"

### Introdução
Código mínimo que faz uso do Spring Boot, ou "esqueleto" para um microserviço.

### Passos
Consulte a configuração em **application.properties** para 
verificar a alteração da configuração
padrão (contexto e porta, nesse caso).

```
$ mvn clean package
$ java -jar target/spring-flyway-1.0.0.jar
$ curl http://localhost:8082/minimo/
```

Além do comando acima é possível colocar a aplicação
em execução por meio de

```
mvn spring-boot:run
```
