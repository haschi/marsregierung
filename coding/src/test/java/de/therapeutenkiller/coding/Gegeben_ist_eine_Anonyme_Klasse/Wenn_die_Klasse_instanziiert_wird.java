package de.therapeutenkiller.coding.Gegeben_ist_eine_Anonyme_Klasse;

import org.junit.Test;

public class Wenn_die_Klasse_instanziiert_wird {

    @Test
    public void dann_wird_keine_Ausnahme_ausgelöst() {
        new Object() { { } };
    }
}
