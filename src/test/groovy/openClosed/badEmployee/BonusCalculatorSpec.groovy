package openClosed.badEmployee


import spock.lang.Specification

class BonusCalculatorSpec extends Specification {
    def "#gradeの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new Employee("アタック西本", grade)
        BonusCalculator calc = new BonusCalculator(100)
        calc.getBonus(emp) == expected
        where:
        grade | expected
        EmployeeGrade.JUNIOR | 100
        EmployeeGrade.MIDDLE | 200
        EmployeeGrade.SENIOR | 300
        null | 400
    }
}
