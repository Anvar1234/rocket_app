package ru.yandex.kingartaved.spacexrocketsapp.data.model;

import ru.yandex.kingartaved.spacexrocketsapp.dto.secondary.*;

import java.time.LocalDate;
import java.util.List;

public class Rocket {
    int id;
    boolean active;
    int stages;
    int boosters;
    long costPerLaunch;
    short successRatePct; //процент успешных запусков, всегда целое до 100
    LocalDate firstFlight;
    String country;
    String company;
    DimensionDto height;
    DimensionDto diameter;
    MassDto massDto;
    List<PayloadWeightDto> payloadWeightDtos;
    FirstStageDto firstStageDto;
    SecondStageDto secondStageDto;
    EngineDto engineDto;
    LandingLegDto landingLegDto;
    String wikipedia;
    String description;
    String rocketId;
    String rocketName;
    String rocketType;
}
