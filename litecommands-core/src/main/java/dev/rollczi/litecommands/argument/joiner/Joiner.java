package dev.rollczi.litecommands.argument.joiner;

import dev.rollczi.litecommands.injector.Injectable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Injectable
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Joiner {

    String delimiter() default " ";

    int limit() default -1;

}
