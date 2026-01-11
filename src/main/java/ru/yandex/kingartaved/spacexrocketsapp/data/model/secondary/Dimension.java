package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dimension {
    BigDecimal meter;
    BigDecimal feet;
}
