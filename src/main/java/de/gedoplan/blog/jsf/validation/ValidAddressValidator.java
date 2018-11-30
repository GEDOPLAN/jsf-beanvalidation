package de.gedoplan.blog.jsf.validation;

import java.util.Objects;
import java.util.stream.Stream;
import javax.enterprise.context.ApplicationScoped;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@ApplicationScoped
public class ValidAddressValidator implements ConstraintValidator<ValidAddress, AddressModel> {
 
    public boolean isValid(AddressModel value, ConstraintValidatorContext context) {
        Object[] attributes = new Object[]{value.getNumber(), value.getCity(), value.getStreet()};
        return Stream.of(attributes).allMatch(Objects::isNull) || Stream.of(attributes).noneMatch(Objects::isNull) ;
    }

}
