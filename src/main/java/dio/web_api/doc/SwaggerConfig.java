package dio.web_api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API do Meu Projeto")
                        .version("1.0.0")
                        .description("API exemplo de Springboot REST API.")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(contato())
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

    private Contact contato() {
        return new Contact()
                .name("Seu Nome")
                .url("https://github.com/TaylanHahn")
                .email("seuemail@exemplo.com");
    }

}

/*
Nota: Esta arquivo está em uma versão mais moderna, com Java 22, mas seria DIFERENTE, caso fosse Java 8 ou 11, necessitaria da anotação @EnableSwagger2 abaixo de @Configuration. Também seria necessário mais verbosidade na parte de configs e infos.

Nota 2: para visualizar no navegador -> http://localhost:8080/swagger-ui.html
*/
