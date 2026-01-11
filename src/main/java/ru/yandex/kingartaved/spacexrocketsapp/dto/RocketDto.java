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
    MassDto massDto;

    @NotNull
    @JsonProperty("payload_weights")
    List<PayloadWeightDto> payloadWeightDtos;

    @NotNull
    @JsonProperty("first_stage")
    FirstStageDto firstStageDto;

    @NotNull
    @JsonProperty("second_stage")
    SecondStageDto secondStageDto;

    @NotNull
    @JsonProperty("engines")
    EngineDto engineDto;

    @NotNull
    @JsonProperty("landing_legs")
    LandingLegDto landingLegDto;

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
