package ru.yandex.kingartaved.spacexrocketsapp.controller;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

import java.util.logging.Logger;

@RequestMapping("api/v1/rockets")
@RestController
public class RocketController {
    Logger logger = Logger.getLogger(RocketController.class.getName());

    @PostMapping()
    public ResponseEntity<String> createListOfRockets(
            @RequestBody @Valid RocketDto rocketsToCreateDto
    ) {
        logger.info("Вызван метод: createListOfRockets()");
        return ResponseEntity.status(HttpStatus.CREATED) //201
                .body(rocketService.createListOfRockets(rocketsToCreateDto));
    }


}
