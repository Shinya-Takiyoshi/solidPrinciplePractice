package domain.model.openClosed.goodEmployee.impl

import com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl.Employee
import com.example.designPatternPractice.domain.model.openClosed.goodEnployee.Impl.ExpertEmployee
import spock.lang.Specification
import spock.lang.Unroll

class ExpertEmployeeImplSpec extends Specification {
    @Unroll
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new ExpertEmployee("アタック西本")
        expect:
        emp.getBonus(base) == expected
        where:
        base | expected
        0    | 0
        100  | 400
        200  | 800
    }
}
