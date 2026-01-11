package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

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
public class LandingLeg {
    int number;
    String material; //может быть null
}
