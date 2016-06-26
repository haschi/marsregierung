package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_statische_Methode;

import de.therapeutenkiller.coding.aspekte.ArgumentIstNullException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class Wenn_die_Methode_mit_einem_null_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_eine_ArgumentIstNullException_ausgelöst() {
        assertThatExceptionOfType(ArgumentIstNullException.class).isThrownBy(() ->
            öffentlicheStatischeMethode(null));
    }

    public static void öffentlicheStatischeMethode(Object o) {
    }
}
