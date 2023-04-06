package com.example.designPatternPractice.domain.model.openClosed.badEmployee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmployeeGrade {
    JUNIOR("JUNIOR",1),
    MIDDLE("MIDDLE",2),
    SENIOR("SENIOR",3);

    private final String gradeKind;
    private final Integer gradeBonus;
    }
