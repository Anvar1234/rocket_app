package ru.yandex.kingartaved.spacexrocketsapp.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.yandex.kingartaved.spacexrocketsapp.data.mapper.RocketMapper;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RocketService {
    private final static Logger logger = LoggerFactory.getLogger(RocketService.class);
    private  final RocketMapper rocketMapper;

    public String createListOfRockets(List<RocketDto> rocketsToCreateDto){
        logger.info("Вызван метод на сервисе: createListOfRockets()");
        StringBuilder result = new StringBuilder();
        for (RocketDto rocketDto : rocketsToCreateDto) {
            result.append(rocketMapper.toDomain(rocketDto)).append("\n");
        }
        return result.toString();
    }
}
