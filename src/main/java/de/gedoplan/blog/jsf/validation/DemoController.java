package de.gedoplan.blog.jsf.validation;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@ViewScoped
@Named("demoController")
public class DemoController implements Serializable {

    private DemoModel model;

    @Inject
    Validator validator;

    public String submit() {
        // pragmatische Lösung über Aufruf Validierung bei Submit
        // Nachteil: die fehlerhaften Daten sind bereits im Model
        Set<ConstraintViolation<DemoModel>> violations = validator.validate(model);
        if (!violations.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(violations.iterator().next().getMessage()));
        } else {
            System.out.print("Submitted: " + this.model);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Alles fein"));
        }

        return null;
    }

    public void validate() {

    }

    @PostConstruct
    private void init() {
        this.model = new DemoModel();
    }

    public DemoModel getModel() {
        return model;
    }

    public void setModel(DemoModel model) {
        this.model = model;
    }

}
