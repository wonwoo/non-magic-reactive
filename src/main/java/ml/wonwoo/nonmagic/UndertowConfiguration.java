package ml.wonwoo.nonmagic;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.undertow.UndertowReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;

@Configurable
@ConditionalOnClazz("io.undertow.Undertow")
public class UndertowConfiguration {

    @Value("${server.port}")
    private int port;

    @Bean
    UndertowReactiveWebServerFactory undertowReactiveWebServerFactory() {
        return new UndertowReactiveWebServerFactory(this.port);
    }
}
