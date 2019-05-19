package ml.wonwoo.nonmagic;

import java.lang.annotation.*;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(EnableNonMagicConfigurationImportSelector.class)
public @interface EnableNonMagicConfiguration {

}
