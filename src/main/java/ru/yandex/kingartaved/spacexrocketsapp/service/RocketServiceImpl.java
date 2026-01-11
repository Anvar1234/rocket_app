package ru.yandex.kingartaved.spacexrocketsapp.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.yandex.kingartaved.spacexrocketsapp.data.mapper.RocketMapper;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

import java.util.List;

@Service
@Profile("prod")
@RequiredArgsConstructor
public class RocketServiceImpl implements RocketService {
    private final static Logger logger = LoggerFactory.getLogger(RocketServiceImpl.class);
    private  final RocketMapper rocketMapper;

    @Override
    public String createListOfRockets(List<RocketDto> rocketsToCreateDto){
        logger.info("Вызван метод на сервисе: createListOfRockets()");
        StringBuilder result = new StringBuilder();
        for (RocketDto rocketDto : rocketsToCreateDto) {
            result.append(rocketMapper.toDomain(rocketDto)).append("\n");
        }
        return result.toString();
    }
}
