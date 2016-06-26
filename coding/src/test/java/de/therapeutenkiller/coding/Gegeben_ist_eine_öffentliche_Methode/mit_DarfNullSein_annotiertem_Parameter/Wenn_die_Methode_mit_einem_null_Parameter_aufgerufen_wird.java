package de.therapeutenkiller.coding.Gegeben_ist_eine_öffentliche_Methode
    .mit_DarfNullSein_annotiertem_Parameter;

import de.therapeutenkiller.coding.aspekte.DarfNullSein;
import org.junit.Test;
public class Wenn_die_Methode_mit_einem_null_Parameter_aufgerufen_wird {

    @Test
    public void dann_wird_keine_Ausnahme_asugelöst() {
        öffentlicheMethodeMitDarfNullSeinParameter(null);
    }

    public void öffentlicheMethodeMitDarfNullSeinParameter(@DarfNullSein Object o) {
    }
}
