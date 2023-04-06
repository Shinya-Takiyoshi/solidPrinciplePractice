package domain.model.goodEmployee

import com.example.designPatternPractice.domain.model.goodEnployee.Impl.Employee
import com.example.designPatternPractice.domain.model.goodEnployee.Impl.SeniorEmployee
import spock.lang.Specification

class SeniorEmployeeImplSpec extends Specification {
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new SeniorEmployee("アタック西本")
        emp.getBonus(base) == expected
        where:
        base | expected
        0    | 0
        100  | 300
        200  | 600
    }
}
