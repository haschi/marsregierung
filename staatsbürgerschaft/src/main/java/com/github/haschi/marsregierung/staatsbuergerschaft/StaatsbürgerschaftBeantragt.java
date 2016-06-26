package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.immutables.value.Value;

@Value.Immutable
public interface StaatsbürgerschaftBeantragt {
    String email();
    Name name();
    Adresse wohnanschrift();
}
