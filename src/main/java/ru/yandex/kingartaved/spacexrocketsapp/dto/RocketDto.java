package ru.yandex.kingartaved.spacexrocketsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;
import ru.yandex.kingartaved.spacexrocketsapp.dto.secondary.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RocketDto {
    @NotNull
    Long id;

    boolean active;

    @JsonProperty("stages")
    int countOfStages; //количество ступеней

    @JsonProperty("boosters")
    int countOfBoosters; //количество ускорителей

    @JsonProperty("cost_per_launch")
    long costPerLaunch;

    @JsonProperty("success_rate_pct")
    short successRatePct; //процент успешных запусков, всегда целое до 100

    @NotEmpty
    String country;

    @NotEmpty
    String company;

    @PastOrPresent
    @JsonProperty("first_flight")
    LocalDate firstFlight;

    @NotNull
    DimensionDto height;

    @NotNull
    DimensionDto diameter;

    @NotNull
    @JsonProperty("mass")
    MassDto mass;

    @NotNull
    @JsonProperty("payload_weights")
    List<PayloadWeightDto> payloadWeights;

    @NotNull
    @JsonProperty("first_stage")
    FirstStageDto firstStage;

    @NotNull
    @JsonProperty("second_stage")
    SecondStageDto secondStage;

    @NotNull
    @JsonProperty("engines")
    EngineDto engine;

    @NotNull
    @JsonProperty("landing_legs")
    LandingLegDto landingLeg;

    String wikipedia;
    String description;

    @NotEmpty
    @JsonProperty("rocket_id")
    String rocketId;

    @NotEmpty
    @JsonProperty("rocket_name")
    String rocketName;

    @NotEmpty
    @JsonProperty("rocket_type")
    String rocketType;
}
