package com.guthub.haschi.marsregierung.buergerportal;

import com.github.haschi.marsregierung.staatsbuergerschaft.BeantrageStaatsbuergerschaft;
import com.github.haschi.marsregierung.staatsbuergerschaft.ImmutableAdresse;
import com.github.haschi.marsregierung.staatsbuergerschaft.ImmutableBeantrageStaatsbuergerschaft;
import com.github.haschi.marsregierung.staatsbuergerschaft.ImmutableName;
import org.axonframework.commandhandling.gateway.CommandGateway;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ViewScoped
@ManagedBean
public class Beantragen implements Serializable {

    @Inject
    private CommandGateway commandGateway;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(final String straße) {
        this.straße = straße;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(final String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(final String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(final String ort) {
        this.ort = ort;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String vorname = "";
    public String nachname ="";
    public String straße ="";
    public String hausnummer = "";
    public String postleitzahl = "";
    public String ort = "";
    public String email = "";

    public String ausführen() {

        final BeantrageStaatsbuergerschaft beantrageStaatsbuergerschaft = ImmutableBeantrageStaatsbuergerschaft.builder()
            .name(ImmutableName.builder().vorname(vorname).nachname(nachname).build())
            .wohnanschrift(ImmutableAdresse.builder()
                .strasse(straße)
                .hausnummer(hausnummer)
                .postleitzahl(postleitzahl)
                .ort(ort)
                .build())
            .emailAdresse(email)
            .build();

        this.commandGateway.sendAndWait(beantrageStaatsbuergerschaft);

        return "index.xhtml";
    }

    public String aktualisieren() {
        final BeantrageStaatsbuergerschaft beantrageStaatsbuergerschaft = ImmutableBeantrageStaatsbuergerschaft.builder()
            .name(ImmutableName.builder().vorname(vorname).nachname(nachname).build())
                .wohnanschrift(ImmutableAdresse.builder()
                    .strasse(straße)
                    .hausnummer(hausnummer)
                    .postleitzahl(postleitzahl)
                    .ort(ort)
                    .build())
                .emailAdresse(email)
                .build();

        this.commandGateway.sendAndWait(beantrageStaatsbuergerschaft);

        return "index";
    }
}
