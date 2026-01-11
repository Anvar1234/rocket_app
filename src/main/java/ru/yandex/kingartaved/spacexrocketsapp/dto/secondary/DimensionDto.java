package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DimensionDto {
    @JsonProperty("meters")
    BigDecimal meter;
    @JsonProperty("feet")
    BigDecimal feet;
}
