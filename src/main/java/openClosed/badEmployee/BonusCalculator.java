package openClosed.badEmployee;

import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors
public class BonusCalculator {
    Integer base;

    public Integer getBonus(Employee employee){
        if (openClosed.badEmployee.EmployeeGrade.JUNIOR == employee.grade){
            return (int) Math.floor(base * openClosed.badEmployee.EmployeeGrade.JUNIOR.getGradeBonus());
        } else if(openClosed.badEmployee.EmployeeGrade.MIDDLE == employee.grade){
            return (int) Math.floor(base * openClosed.badEmployee.EmployeeGrade.MIDDLE.getGradeBonus());
        } else if(openClosed.badEmployee.EmployeeGrade.SENIOR == employee.grade){
            return (int) Math.floor(base * EmployeeGrade.SENIOR.getGradeBonus());
        } else {
            return (int) Math.floor(base * 4);
        }
    }
}
