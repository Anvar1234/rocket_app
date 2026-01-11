package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Характеристики посадочных ножек
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandingLegDto {
    @Min(0)
    @JsonProperty("number")
    int number;

    @JsonProperty("material")
    String material; //может быть null
}
