package ru.yandex.kingartaved.spacexrocketsapp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;
import ru.yandex.kingartaved.spacexrocketsapp.service.RocketService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/rockets")
@RequiredArgsConstructor
public class RocketController {
    private static final Logger logger = Logger.getLogger(RocketController.class.getName());
    private final RocketService rocketService;

    @PostMapping()
    public ResponseEntity<String> createListOfRockets(
            @RequestBody @Valid List<RocketDto> rocketsToCreateDto
    ) {
        logger.info("Вызван метод на контроллере: createListOfRockets()");
        return ResponseEntity.status(HttpStatus.CREATED) //201
                .body(rocketService.createListOfRockets(rocketsToCreateDto));
    }
}
