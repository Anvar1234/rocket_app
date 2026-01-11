package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Описание второй ступени
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondStageDto {
    @Min(1)
    @JsonProperty("engines")
    int countOfEngines;

    @NotNull
    @JsonProperty("fuel_amount_tons")
    BigDecimal fuelAmount;

    @JsonProperty("burn_time_sec")
    int burnTime;

    @JsonProperty("thrust")
    ThrustDto thrustDto;

    @JsonProperty("payloads")
    PayloadDto payloadDto;
}
