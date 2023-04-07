package openClosed.goodEmployee.impl

import openClosed.goodEnployee.Impl.Employee
import openClosed.goodEnployee.Impl.SeniorEmployee
import spock.lang.Specification
import spock.lang.Unroll

class SeniorEmployeeImplSpec extends Specification {
    @Unroll
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new SeniorEmployee("アタック西本")
        expect:
        emp.getBonus(base) == expected
        where:
        base | expected
        0    | 0
        100  | 300
        200  | 600
    }
}
