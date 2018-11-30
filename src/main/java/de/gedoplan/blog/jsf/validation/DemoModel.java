package de.gedoplan.blog.jsf.validation;

import de.gedoplan.blog.jsf.validation.groups.NewsletterReciver;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
public class DemoModel {

    @NotNull
    @Size(min = 4)
    private String firstname;

    @NotNull
    @Size(min = 4)
    private String lastname;

    private boolean reciveNewsletter;

    @Min(value = 18, groups = NewsletterReciver.class)
    @NotNull(groups = NewsletterReciver.class)
    private Integer age;

    @Valid
    private AddressModel address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isReciveNewsletter() {
        return reciveNewsletter;
    }

    public void setReciveNewsletter(boolean reciveNewsletter) {
        this.reciveNewsletter = reciveNewsletter;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AddressModel getAddress() {
        if (address==null) address=new AddressModel();
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    

    @Override
    public String toString() {
        return "DemoModel{" + "firstname=" + firstname + ", lastname=" + lastname + ", reciveNewsletter=" + reciveNewsletter + ", age=" + age + ", address=" + address + '}';
    }



    

}
