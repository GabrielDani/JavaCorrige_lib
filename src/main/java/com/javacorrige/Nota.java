package com.javacorrige;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR}) // Apenas atributos, métodos e construtores
@Retention(RetentionPolicy.RUNTIME) // Disponível em tempo de execução
public @interface Nota {
    double value() default 0.0; // Representa a nota atribuída
}

