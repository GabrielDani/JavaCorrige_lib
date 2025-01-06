package com.javacorrige;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Aplicável apenas a métodos
@Retention(RetentionPolicy.RUNTIME) // Disponível em tempo de execução
public @interface Testar {
    String[] parametros() default {}; // Valores dos parâmetros como strings
    String[] construtor() default {};
}
