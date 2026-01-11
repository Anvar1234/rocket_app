package ru.yandex.kingartaved.spacexrocketsapp.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary.Thrust;
import ru.yandex.kingartaved.spacexrocketsapp.dto.secondary.ThrustDto;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ThrustMapper {
    Thrust toThrust(ThrustDto thrustDto);
    ThrustDto toThrustDto(Thrust thrust);
}