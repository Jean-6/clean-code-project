package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;

import io.vavr.control.Either;
import io.vavr.control.Option;

public class DeckMongoDbAdapter implements DeckPersistenceSpi {

    @Override
    public Either<ApplicationError, Deck> save(Deck o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Iterable<Deck>> saveInBatch(Iterable<Deck> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Deck> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Iterable<Deck>> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteInBatch(Iterable<UUID> ids) {
        // TODO Auto-generated method stub
        return null;
    }
    
}