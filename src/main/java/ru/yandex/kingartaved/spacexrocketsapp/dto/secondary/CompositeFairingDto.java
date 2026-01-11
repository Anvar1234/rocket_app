package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Композитный обтекатель
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompositeFairingDto {
    @NotNull
    @JsonProperty("height")
    DimensionDto height;

    @NotNull
    @JsonProperty("diameter")
    DimensionDto diameter;
}