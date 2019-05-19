package ml.wonwoo.nonmagic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.jetty.JettyReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClazz("org.eclipse.jetty.server.Server")
public class JettyConfiguration {

    @Value("${server.port}")
    private int port;

    @Bean
    JettyReactiveWebServerFactory jettyReactiveWebServerFactory() {
        return new JettyReactiveWebServerFactory(this.port);
    }
}
