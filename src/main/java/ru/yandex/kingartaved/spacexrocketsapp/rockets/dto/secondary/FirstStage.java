package ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstStage {
    boolean reusable; //многоразовый или нет
    int engine;
    @JsonProperty("fuel_amount_tons")
    BigDecimal fuelAmount;
    @JsonProperty("cores")
    int core;
    @JsonProperty("burn_time_sec")
    int burnTime;
    @JsonProperty("thrust_sea_level")
    ThrustDto thrustDtoSeaLevel;
    @JsonProperty("thrust_vacuum")
    ThrustDto thrustDtoVacuum;
}
