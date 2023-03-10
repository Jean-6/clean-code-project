package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Assassin;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Mage;
import com.esgi.cleancode.domain.functional.model.Tank;
import com.esgi.cleancode.server.mongo.entity.HeroEntity;

import io.vavr.collection.List;

public interface HeroEntityMapper {

    public static Hero toDomain(HeroEntity entity) {
        switch(entity.getSpeciality()) {
            case ASSASSIN:
                return Assassin.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            case MAGE:
                return Mage.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            case TANK:
                return Tank.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            default:
                return null; // TODO NOT CLEAN
        }
    }

    public static List<Hero> toDomain(List<HeroEntity> entities) {
        return List.ofAll(entities.map(entity -> toDomain(entity)));   
    }

    public static HeroEntity fromDomain(Hero hero) {
        return HeroEntity.builder()
            .id(hero.getId())
            .name(hero.getName())
            .healthPoint(hero.getHealthPoint())
            .power(hero.getPower())
            .armor(hero.getArmor())
            .experiencePoints(hero.getExperiencePoints())
            .level(hero.getLevel())
            .rarity(hero.getRarity())
            .speciality(hero.getSpeciality())
            .build();
    }

    public static List<HeroEntity> fromDomain(List<Hero> heroes) {
        return List.ofAll(heroes.map(hero -> fromDomain(hero)));
    }
}
