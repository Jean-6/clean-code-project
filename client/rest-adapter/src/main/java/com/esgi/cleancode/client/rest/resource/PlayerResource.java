package com.esgi.cleancode.client.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.domain.ports.client.PlayerCreatorApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerResource {

    private final PlayerCreatorApi PlayerCreatorApi;

    @GetMapping
    ResponseEntity<Object> getAllPlayers() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("{playerId}")
    ResponseEntity<Object> getPlayer(@PathVariable String playerId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    ResponseEntity<Object> createPlayer(@RequestBody PlayerCreationDto dto) {
        return ResponseEntity.ok().build();
    }
}
