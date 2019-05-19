package ml.wonwoo.nonmagic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClazz("org.apache.catalina.startup.Tomcat")
public class TomcatConfiguration {

    @Value("${server.port}")
    private int port;

    @Bean
    TomcatReactiveWebServerFactory tomcatReactiveWebServerFactory() {
        return new TomcatReactiveWebServerFactory(this.port);
    }

}
