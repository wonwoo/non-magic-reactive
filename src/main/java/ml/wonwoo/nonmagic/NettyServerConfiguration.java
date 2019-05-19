package ml.wonwoo.nonmagic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClazz("reactor.netty.http.server.HttpServer")
public class NettyServerConfiguration {

    @Value("${server.port}")
    private int port;

    @Bean
    NettyReactiveWebServerFactory nettyReactiveWebServerFactory() {
        return new NettyReactiveWebServerFactory(this.port);
    }
}
