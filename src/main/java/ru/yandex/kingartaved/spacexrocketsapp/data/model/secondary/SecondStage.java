package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

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
public class SecondStage {
    int countOfEngines;
    BigDecimal fuelAmount;
    int burnTime;
    Thrust thrust;
    Payload payload;
}
