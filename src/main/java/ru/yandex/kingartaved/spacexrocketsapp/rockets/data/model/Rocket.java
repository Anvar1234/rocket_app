package ru.yandex.kingartaved.spacexrocketsapp.rockets.data.model;

import ru.yandex.kingartaved.spacexrocketsapp.rockets.dto.secondary.*;

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
    Dimension height;
    Dimension diameter;
    Mass mass;
    List<PayloadWeight> payloadWeights;
    FirstStage firstStage;
    SecondStageDto secondStageDto;
    Engine engine;
    LandingLeg landingLeg;
    String wikipedia;
    String description;
    String rocketId;
    String rocketName;
    String rocketType;
}
