package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode.mit_Rückgabewert;

import de.therapeutenkiller.coding.aspekte.RückgabewertIstNullException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class Wenn_die_Methode_null_zurückgibt {

    @Test
    public void dann_wird_eine_RückgabewertIstNullException_ausgelöst() {
        assertThatExceptionOfType(RückgabewertIstNullException.class)
            .isThrownBy(this::öffentlicheMethodeMitRückgabewert);
    }

    public Object öffentlicheMethodeMitRückgabewert() {
        return null;
    }
}
