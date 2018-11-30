package de.gedoplan.blog.jsf.validation;

import de.gedoplan.blog.jsf.validation.groups.WithAdress;
import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@ValidAddress
public class AddressModel implements Serializable {

    @NotNull(groups = WithAdress.class)
    private String street;

    @NotNull(groups = WithAdress.class)
    @Min(value = 1, groups = WithAdress.class)
    private Integer number;

    @NotNull(groups = WithAdress.class)
    @Size(min = 4, groups = WithAdress.class)
    private String city;

    public AddressModel() {
    }

    public AddressModel(String street, Integer number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" + "street=" + street + ", number=" + number + ", city=" + city + '}';
    }
}
