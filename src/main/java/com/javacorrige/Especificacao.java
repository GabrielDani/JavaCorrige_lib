package com.javacorrige;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Especificacao {
    boolean todosAtributosPrivados() default true;
    boolean atributosExatos() default false; 
    boolean construtoresExatos() default false;
    boolean metodosExatos() default false;
    double penalidade() default 0.0;
    double similaridade() default 1;
}
