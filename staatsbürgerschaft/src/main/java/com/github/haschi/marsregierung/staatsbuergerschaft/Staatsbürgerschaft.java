package com.github.haschi.marsregierung.staatsbuergerschaft;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;

public class Staatsbürgerschaft extends AbstractAnnotatedAggregateRoot<String> {

    private static final long serialVersionUID = 1L;

    @AggregateIdentifier
    private String email;

    protected Staatsbürgerschaft() {}

    @CommandHandler
    public Staatsbürgerschaft(final ImmutableStaatsbürgerschaftBeantragt befehl) {
        final ImmutableStaatsbürgerschaftBeantragt ereignis = ImmutableStaatsbürgerschaftBeantragt.builder()
            .email(befehl.email())
            .name(befehl.name())
            .wohnanschrift(befehl.wohnanschrift())
            .build();

        this.apply(ereignis);
    }

    @EventSourcingHandler
    private void falls(final StaatsbürgerschaftBeantragt ereignis) {
        this.email = ereignis.email();
    }
}
