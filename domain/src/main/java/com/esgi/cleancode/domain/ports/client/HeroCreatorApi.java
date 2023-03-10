package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface HeroCreatorApi {

    Either<ApplicationError, List<Hero>> createAll(String name, SpecialityEnum speciality);
    
    Either<ApplicationError, Hero> create(String name, RarityEnum rarity, SpecialityEnum speciality);

}
