package com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmployeeGrade {
    JUNIOR(1),
    MIDDLE(2),
    SENIOR(3),
    EXPERT(4);

    private final Integer gradeBonus;
    }
