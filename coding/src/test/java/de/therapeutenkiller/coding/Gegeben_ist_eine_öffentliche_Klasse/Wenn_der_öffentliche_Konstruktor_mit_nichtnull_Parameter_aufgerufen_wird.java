package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Klasse;

import org.junit.Test;

public class Wenn_der_öffentliche_Konstruktor_mit_nichtnull_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_keine_Ausnahme_ausgelöst() {
        new ÖffentlicheKlasse("Hello World");
    }
}
