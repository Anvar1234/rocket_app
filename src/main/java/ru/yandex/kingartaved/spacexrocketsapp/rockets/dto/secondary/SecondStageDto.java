package ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondStageDto {
    @JsonProperty("engines")
    int engine;
    @JsonProperty("fuel_amount_tons")
    BigDecimal fuelAmount;
    @JsonProperty("burn_time_sec")
    int burnTime;
    ThrustDto thrustDto;
    @JsonProperty("payloads")
    Payload payload;
}
