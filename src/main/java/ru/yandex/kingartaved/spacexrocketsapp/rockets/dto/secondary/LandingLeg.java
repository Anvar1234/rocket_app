package ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Характеристики посадочных ножек
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandingLeg {
    @JsonProperty("number")
    int number;

    @JsonProperty("material")
    String material;
}
