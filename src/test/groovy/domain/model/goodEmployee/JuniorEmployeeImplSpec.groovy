package domain.model.goodEmployee

import com.example.designPatternPractice.domain.model.goodEnployee.Impl.Employee
import com.example.designPatternPractice.domain.model.goodEnployee.Impl.JuniorEmployee
import spock.lang.Specification

class JuniorEmployeeImplSpec extends Specification {
    def "#baseの時、ボーナス値は#expectedである"() {
        given:
        Employee emp = new JuniorEmployee("アタック西本")
        emp.getBonus(base)== expected
        where:
        base | expected
        100  | 100
        200  | 200
        300  | 300
    }
}
