package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Масса полезной нагрузки
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayloadWeight {
    String id;
    String name;
    int kg;
    BigDecimal lb;
}
