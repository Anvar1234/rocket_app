package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Тяга на уровне моря
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thrust {
    private BigDecimal kN;
    private BigDecimal lbf;
}
