package ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Полезная нагрузка
 */
public class Payload {
    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("option_2")
    private String option2;

    @JsonProperty("composite_fairing")
    private CompositeFairing fairing;
}