package ru.yandex.kingartaved.spacexrocketsapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

import java.util.List;

@Service
@Profile("!prod")
public class RocketServiceTest implements RocketService {

    @Override
    public String createListOfRockets(List<RocketDto> rocketsToCreateDto) {
        return "Test string";
    }
}
