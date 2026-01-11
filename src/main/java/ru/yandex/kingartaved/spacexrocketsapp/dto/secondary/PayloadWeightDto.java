package ru.yandex.kingartaved.spacexrocketsapp.dto.secondary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Масса полезной нагрузки
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PayloadWeightDto {
    @NotEmpty
    @JsonProperty("id")
    String id;

    @NotEmpty
    @JsonProperty("name")
    String name;

    @Min(1)
    @JsonProperty("kg")
    int kg;

    @NotNull
    @DecimalMin("2.2")
    @JsonProperty("lb")
    BigDecimal lb;
}
