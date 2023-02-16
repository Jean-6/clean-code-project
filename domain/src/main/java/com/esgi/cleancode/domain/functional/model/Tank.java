package com.esgi.cleancode.domain.functional.model;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

import lombok.Builder;
import lombok.Generated;
import lombok.Value;
import lombok.Builder.Default;

@Value
@Builder
public class Tank implements Hero {

    @Generated
    long id;
    String name;
    double healthPoint;
    double power;
    double armor;
    @Default
    int experiencePoints = 0;
    @Default
    int level = 1;
    RarityEnum rarity;
    SpecialityEnum speciality;
    
}