package com.example.layerdArkitech.domain.model.badEmployee;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
public class BonusCalculator {
    Integer base;

    public Integer getBonus(Employee employee){
        if (EmployeeGrade.JUNIOR == employee.grade){
            return (int) Math.floor(base * EmployeeGrade.JUNIOR.getGradeBonus());
        } else if(EmployeeGrade.MIDDLE == employee.grade){
            return (int) Math.floor(base * EmployeeGrade.MIDDLE.getGradeBonus());
        } else if(EmployeeGrade.SENIOR == employee.grade){
            return (int) Math.floor(base * EmployeeGrade.SENIOR.getGradeBonus());
        } else {
            return (int) Math.floor(base * 4);
        }
    }
}
