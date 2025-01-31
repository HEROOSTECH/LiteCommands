package dev.rollczi.litecommands.command.route;

import dev.rollczi.litecommands.factory.FactoryAnnotationResolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Route {

    String name();

    String[] aliases() default {};

    FactoryAnnotationResolver<Route> RESOLVER = new RouteAnnotationResolver();

}
