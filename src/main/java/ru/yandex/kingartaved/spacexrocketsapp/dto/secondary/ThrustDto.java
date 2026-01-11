package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * Тяга на уровне моря
 */
public class ThrustDto {
    @NotNull
    @JsonProperty("kN")
    private BigDecimal kN;

    @NotNull
    @JsonProperty("lbf")
    private BigDecimal lbf;
}
