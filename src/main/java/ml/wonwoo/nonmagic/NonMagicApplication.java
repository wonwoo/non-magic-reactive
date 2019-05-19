package ml.wonwoo.nonmagic;

import java.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@ComponentScan
@EnableMagicConfiguration
public @interface NonMagicApplication {

}
