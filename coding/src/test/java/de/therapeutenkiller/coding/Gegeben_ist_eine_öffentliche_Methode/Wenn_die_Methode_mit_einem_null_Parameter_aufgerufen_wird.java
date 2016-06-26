package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode;

import org.junit.Test;

public class Wenn_die_Methode_mit_einem_null_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_eine_ArgumentIstNullException_ausgelöst() {
        öffentlicheMethode(null);
    }

    public void öffentlicheMethode(Object o) {
    }
}
