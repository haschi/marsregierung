package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.immutables.value.Value;

@Value.Immutable
public interface Adresse {

    String strasse();

    String hausnummer();

    String postleitzahl();

    String ort();
}
