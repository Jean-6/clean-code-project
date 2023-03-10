package com.esgi.cleancode.client.rest.dto;

import com.esgi.cleancode.domain.functional.model.Hero;
import com.fasterxml.jackson.annotation.JsonProperty;


public record BattleCreationDto(
    @JsonProperty("attacker") Hero attacker,
    @JsonProperty("attacked") Hero attacked) {  }
