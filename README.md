# study-api
https://start.spring.io/
utilizar maven, java, 3.4.3

Adicionar dependência no pom.xml 
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.8.5</version>
		</dependency>

mvn spring-boot:run
http://localhost:8080/swagger-ui/index.html

abrir https://start.spring.io/
vamos adicionar as dependências: Spring Boot DevTools
Olha o XML e pega o código da dependência

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <scope>runtime</scope>
      <optional>true</optional>
    </dependency>
