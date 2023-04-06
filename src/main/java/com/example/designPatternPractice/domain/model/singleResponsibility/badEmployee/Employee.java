package com.example.designPatternPractice.domain.model.singleResponsibility.badEmployee;

import com.example.designPatternPractice.domain.model.openClosed.badEmployee.EmployeeGrade;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
    String name;
    EmployeeGrade grade;
}
