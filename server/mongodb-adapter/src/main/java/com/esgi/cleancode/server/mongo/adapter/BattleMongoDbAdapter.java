package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;

import io.vavr.control.Either;
import io.vavr.control.Option;

public class BattleMongoDbAdapter implements BattlePersistenceSpi {

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

    @Override
    public Option<Iterable<Battle>> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Battle> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Battle> save(Battle o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Iterable<Battle>> saveInBatch(Iterable<Battle> oList) {
        // TODO Auto-generated method stub
        return null;
    }
    
}