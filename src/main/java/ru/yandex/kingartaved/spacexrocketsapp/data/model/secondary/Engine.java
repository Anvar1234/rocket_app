package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Характеристики двигателя
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    int number;
    String type;
    String version; //может быть пустым, но не null
    String layout; //может быть null
    Integer engineLossMax; //максимальная потеря мощности двигателя, может быть null
    String propellant1; //топливо
    String propellant2;
    Thrust thrustSeaLevel;
    Thrust thrustVacuum;
    BigDecimal thrustToWeight; //может быть null
}