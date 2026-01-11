package ru.yandex.kingartaved.spacexrocketsapp.data.model;

import lombok.*;
import ru.yandex.kingartaved.spacexrocketsapp.data.model.secondary.*;
import ru.yandex.kingartaved.spacexrocketsapp.dto.secondary.*;

import java.time.LocalDate;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    SecondStage secondStage;
    Engine engine;
    LandingLeg landingLeg;
    String wikipedia;
    String description;
    String rocketId;
    String rocketName;
    String rocketType;
}
