package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.server.mongo.entity.DeckEntity;

import io.vavr.collection.List;

public interface DeckEntityMapper {
    
    static Deck toDomain(DeckEntity entity) {
        return Deck.builder()
            .id(entity.getId())
            .heroes(List.ofAll(entity.getHeroes()).map(HeroEntityMapper::toDomain))
            .build();
    }

    static List<Deck> toDomain(List<DeckEntity> entities) {
        return entities.map(entity -> toDomain(entity));
    }

    static DeckEntity fromDomain(Deck deck) {
        return DeckEntity.builder()
            .id(deck.getId())
            .heroes(deck.getHeroes().map(HeroEntityMapper::fromDomain).asJavaMutable())
            .build();
    }
}
