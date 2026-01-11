package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

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
public class CompositeFairingDto {
    @NotNull
    @JsonProperty("height")
    DimensionDto height;

    @NotNull
    @JsonProperty("diameter")
    DimensionDto diameter;
}