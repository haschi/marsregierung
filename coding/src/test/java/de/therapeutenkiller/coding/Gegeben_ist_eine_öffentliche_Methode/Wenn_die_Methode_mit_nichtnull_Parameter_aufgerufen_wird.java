package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode;

import org.junit.Test;

public class Wenn_die_Methode_mit_nichtnull_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_keine_Ausnahme_ausgelöst() {
        öffentlicheMethode("Hello World");
    }

    public void öffentlicheMethode(Object s) {
    }
}
