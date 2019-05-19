package ml.wonwoo.nonmagic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.context.annotation.Conditional;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnClazzCondition.class)
public @interface ConditionalOnClazz {

    String value();
}
