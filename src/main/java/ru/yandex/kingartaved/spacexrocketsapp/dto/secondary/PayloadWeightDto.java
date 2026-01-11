package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * Масса полезной нагрузки
 */
public class PayloadWeightDto {
    @NotEmpty
    String id;

    @NotEmpty
    String name;

    @Min(1)
    int kg;

    @NotNull
    @DecimalMin("2.2")
    BigDecimal lb;
}
