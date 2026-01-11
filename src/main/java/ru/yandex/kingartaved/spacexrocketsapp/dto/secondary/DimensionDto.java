package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DimensionDto {
    @JsonProperty("meters")
    BigDecimal meter;
    @JsonProperty("feet")
    BigDecimal feet;
}
