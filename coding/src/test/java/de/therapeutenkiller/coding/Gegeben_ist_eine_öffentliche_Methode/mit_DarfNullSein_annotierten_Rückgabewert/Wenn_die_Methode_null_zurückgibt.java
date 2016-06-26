package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode
    .mit_DarfNullSein_annotierten_Rückgabewert;

import de.therapeutenkiller.coding.aspekte.DarfNullSein;
import org.junit.Test;

public class Wenn_die_Methode_null_zurückgibt {

    @Test
    public void dann_wird_keine_Ausnahme_ausgelöst() {
        öffentlicheMitDarfNullSeinAnnotierteMethode();
    }

    @DarfNullSein
    public Object öffentlicheMitDarfNullSeinAnnotierteMethode() {
        return null;
    }
}
