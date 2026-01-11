package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;

/**
 * Полезная нагрузка
 */
public class PayloadDto {
    @NotEmpty
    @JsonProperty("option_1")
    private String option1;

    @JsonProperty("option_2")
    private String option2; //может быть пустым

    @JsonProperty("composite_fairing")
    private CompositeFairingDto fairing;
}