package com.guthub.haschi.marsregierung.buergerportal;

import com.github.haschi.marsregierung.staatsbuergerschaft.ImmutableBeantrageStaatsbuergerschaft;
import com.github.haschi.marsregierung.staatsbuergerschaft.Staatsbürgerschaft;
import org.axonframework.repository.Repository;

import javax.inject.Inject;

public class StaatsbürgerschaftCommandHandler {

    @Inject
    private Repository<Staatsbürgerschaft> repository;

    // @CommandHandler
    public void handle(final ImmutableBeantrageStaatsbuergerschaft command) {
        final Staatsbürgerschaft staatsbürgerschaft = new Staatsbürgerschaft(command);
        repository.add(staatsbürgerschaft);
    }
}
