## Configuração usando beans

### Introdução
Recurso para configuração de beans.
A anotação \@Bean é empregada em
método público cujo nome é o identificador
do bean. O retorno desse método identifica
o tipo do bean. 

Feito isso o bean definido pode ser
injetado pelo Spring. Uma forma é
empregando a anotação \@Autowired em
uma das propriedades da classe, juntamente
com a anotação \@Resource. Essa última
deve receber como parâmetro o nome (identificador)
do bean cujo valor deve ser atribuído à propriedade em questão.

### Passos

```
$ mvn clean package
$ java -jar target/beans-0.0.1.jar
$ curl http://localhost:8080
```

Além do comando acima é possível colocar a aplicação
em execução por meio de

```
mvn spring-boot:run
```
