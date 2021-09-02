package main.task_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


    @Target(ElementType.TYPE)
    @Retention(value = RetentionPolicy.RUNTIME)
    public @interface Repeat{
        int count() default 1;
    }

