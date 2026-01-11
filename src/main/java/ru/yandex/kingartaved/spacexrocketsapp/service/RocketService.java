package ru.yandex.kingartaved.spacexrocketsapp.service;

import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

import java.util.List;

public interface RocketService {
    String createListOfRockets(List<RocketDto> rocketsToCreateDto);
}
