package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @Min(1)
    int number;

    @NotEmpty
    String type;

    @NotNull
    String version; //может быть пустым, но не null

    String layout; //может быть null

    @JsonProperty("engine_loss_max")
    Integer engineLossMax; //максимальная потеря мощности двигателя, может быть null

    @NotEmpty
    @JsonProperty("propellant_1")
    String propellant1; //топливо

    @NotEmpty
    @JsonProperty("propellant_2")
    String propellant2;

    @NotNull
    @JsonProperty("thrust_sea_level")
    ThrustDto thrustSeaLevelDto;

    @NotNull
    @JsonProperty("thrust_vacuum")
    ThrustDto thrustVacuumDto;

    @JsonProperty("thrust_to_weight")
    BigDecimal thrustToWeight; //может быть null
}