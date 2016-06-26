package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Klasse;

import de.therapeutenkiller.coding.aspekte.ArgumentIstNullException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class Wenn_der_öffentliche_Konstruktor_mit_null_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_eine_ArgumentIstNullException_ausgelöst() {
        assertThatExceptionOfType(ArgumentIstNullException.class).isThrownBy(() ->
            new ÖffentlicheKlasse(null));
    }
}
