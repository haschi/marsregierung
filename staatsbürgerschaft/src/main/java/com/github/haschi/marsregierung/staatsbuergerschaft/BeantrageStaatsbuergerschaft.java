package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.immutables.value.Value;

@Value.Immutable
public interface BeantrageStaatsbuergerschaft  {
    Name name();
    String strasse();
    String hausnummer();
    String postleitzahl();
    String ort();
    String emailAdresse();
}
