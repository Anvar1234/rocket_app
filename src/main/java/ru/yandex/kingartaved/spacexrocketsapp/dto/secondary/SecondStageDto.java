package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

/**
 * Описание второй ступени
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
    ThrustDto thrust;

    @JsonProperty("payloads")
    PayloadDto payload;
}
