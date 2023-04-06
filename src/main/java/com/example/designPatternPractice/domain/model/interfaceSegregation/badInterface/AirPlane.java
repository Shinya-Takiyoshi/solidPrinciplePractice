package com.example.designPatternPractice.domain.model.interfaceSegregation.badInterface;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AirPlane implements Vehicle {
    String name;
    String color;
    VehicleState state;

    /**
     * 運転を開始する
     */
    @Override
    public void start() {
        this.state = VehicleState.START;
    }

    /**
     * 運転を停止する
     */
    @Override
    public void stop() {
        this.state = VehicleState.STOP;
    }

    /**
     * 飛行する
     */
    @Override
    public void fly(){
        this.state = VehicleState.FLY;
    }
}
