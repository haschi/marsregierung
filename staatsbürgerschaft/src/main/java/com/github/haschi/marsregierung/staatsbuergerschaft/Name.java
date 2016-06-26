package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.immutables.value.Value;

@Value.Immutable
public interface Name {

    String vorname();

    String nachname();
}
