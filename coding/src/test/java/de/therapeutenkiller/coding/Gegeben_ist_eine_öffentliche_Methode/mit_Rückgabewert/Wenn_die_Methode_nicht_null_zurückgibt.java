package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode.mit_Rückgabewert;

/**
 * Created by m.haschka on 11/4/15.
 */
public class Wenn_die_Methode_nicht_null_zurückgibt {

    public void dann_wird_keine_Ausnahme_ausgelöst() {
        methodeMitRückgabewert();
    }

    public Object methodeMitRückgabewert() {
        return "Hello World";
    }
}
