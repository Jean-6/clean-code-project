package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import io.vavr.control.Either;
import io.vavr.control.Option;

public class PlayerMongoDbAdapter implements PlayerPersistenceSpi {

    @Override
    public Either<ApplicationError, Player> save(Player o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Player> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Iterable<Player>> saveInBatch(Iterable<Player> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Iterable<Player>> findAll() {
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
