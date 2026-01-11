package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

/**
 * Описание первой ступени
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FirstStageDto {
    @JsonProperty("reusable")
    boolean reusable; //многоразовый или нет

    @Min(1)
    @JsonProperty("engines")
    int engine;

    @NotNull
    @JsonProperty("fuel_amount_tons")
    BigDecimal fuelAmount;

    @JsonProperty("cores")
    Long core; //может быть null

    @JsonProperty("burn_time_sec")
    int burnTime;

    @NotNull
    @JsonProperty("thrust_sea_level")
    ThrustDto thrustSeaLevel;

    @NotNull
    @JsonProperty("thrust_vacuum")
    ThrustDto thrustVacuum;
}
