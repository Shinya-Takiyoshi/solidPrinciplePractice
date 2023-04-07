package openClosed.goodEmployee.impl

import openClosed.goodEnployee.Impl.Employee
import openClosed.goodEnployee.Impl.JuniorEmployee
import spock.lang.Specification
import spock.lang.Unroll

class JuniorEmployeeImplSpec extends Specification {
    @Unroll
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new JuniorEmployee("アタック西本")
        expect:
        emp.getBonus(base) == expected
        where:
        base | expected
        0    | 0
        100  | 100
        200  | 200
    }
}
