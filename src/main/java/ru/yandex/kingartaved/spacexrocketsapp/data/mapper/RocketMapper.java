package ru.yandex.kingartaved.spacexrocketsapp.data.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import ru.yandex.kingartaved.spacexrocketsapp.data.model.Rocket;
import ru.yandex.kingartaved.spacexrocketsapp.dto.RocketDto;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring"
)
public interface RocketMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RocketDto toDto(Rocket rocket);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rocket toDomain(RocketDto rocketDto);
}
