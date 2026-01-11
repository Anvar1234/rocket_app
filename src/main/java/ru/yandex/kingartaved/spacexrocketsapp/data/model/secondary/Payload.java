package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Полезная нагрузка
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payload {
    private String option1;
    private String option2; //может быть пустым
    private CompositeFairing fairing;
}