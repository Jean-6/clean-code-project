package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {

    @Override
    default PlayerEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<PlayerEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlayerEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PlayerEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void delete(PlayerEntity entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteInBatch(Iterable<PlayerEntity> entities) {
        // TODO Auto-generated method stub
    }
}
