package ml.wonwoo.nonmagic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.server.adapter.WebHttpHandlerBuilder;

@Configuration
public class WebHandlerConfiguration {

    @Bean
    HttpHandler httpHandler(ApplicationContext applicationContext) {
        return WebHttpHandlerBuilder.applicationContext(applicationContext).build();
    }
}
