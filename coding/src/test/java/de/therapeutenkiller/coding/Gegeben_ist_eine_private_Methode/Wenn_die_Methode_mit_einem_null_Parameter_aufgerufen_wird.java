package de.therapeutenkiller.coding.Gegeben_ist_eine_private_Methode;

import org.junit.Test;

public class Wenn_die_Methode_mit_einem_null_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_keine_Ausnahme_ausgelöst() {
        privateMethode(null);
    }

    private void privateMethode(Object o) {
    }
}
