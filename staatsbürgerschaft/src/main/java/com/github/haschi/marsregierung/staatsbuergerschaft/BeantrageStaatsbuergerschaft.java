package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.immutables.value.Value;

@Value.Immutable
public interface BeantrageStaatsbuergerschaft {
    Name name();
    Adresse wohnanschrift();
    String emailAdresse();
}
