package com.example.designPatternPractice.domain.model.interfaceSegregation.goodInterface;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum VehicleState {
    START("START"),
    STOP("STOP"),
    FLY("FLY");

    private final String state;
}
