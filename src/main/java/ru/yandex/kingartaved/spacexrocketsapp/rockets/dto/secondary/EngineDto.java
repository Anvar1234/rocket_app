package ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Характеристики двигателя
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineDto {
    int number;
    String type;
    String version;
    String layout;
    @JsonProperty("engine_loss_max")
    Integer engineLossMax; //максимальная потеря мощности двигателя
    String propellant1; //топливо
    String propellant2;
    @JsonProperty("thrust_sea_level")
    ThrustDto thrustDtoSeaLevel;
    @JsonProperty("thrust_vacuum")
    ThrustDto thrustDtoVacuum;
    @JsonProperty("thrust_to_weight")
    BigDecimal thrustToWeight;
}