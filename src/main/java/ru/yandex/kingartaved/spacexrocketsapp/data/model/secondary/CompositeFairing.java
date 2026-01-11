package ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Композитный обтекатель
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompositeFairing {
    Dimension height;
    Dimension diameter;
}