package de.gedoplan.blog.jsf.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;

/**
 *
 * @author Dominik Mathmann
 */
@Constraint(validatedBy = ValidAddressValidator.class)
@Target(value = {ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface ValidAddress {

    String message() default "Adresse unvollständig";

    Class[] groups() default {};

    Class[] payload() default {};
}
