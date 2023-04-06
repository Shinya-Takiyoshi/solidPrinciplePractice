package domain.model.openClosed.goodEmployee.impl

import com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl.Employee
import com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl.MiddleEmployee
import spock.lang.Specification
import spock.lang.Unroll

class MiddleEmployeeImplSpec extends Specification {
    @Unroll
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new MiddleEmployee("アタック西本")
        expect:
        emp.getBonus(base) == expected
        where:
        base | expected
        0    | 0
        100  | 200
        200  | 400
    }
}
