package com.psi.valid;

import com.psi.valid.*;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy=LocalDateValidator.class)
public @interface LocalDate {
	boolean required() default true;
	String message() default "123456";
	Class<?>[]groups() default{};
	Class<? extends Payload>[] payload() default{};
	

}
