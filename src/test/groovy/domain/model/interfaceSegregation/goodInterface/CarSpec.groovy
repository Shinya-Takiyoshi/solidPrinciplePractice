package domain.model.interfaceSegregation.goodInterface

import com.example.designPatternPractice.domain.model.interfaceSegregation.goodInterface.Car
import com.example.designPatternPractice.domain.model.interfaceSegregation.goodInterface.VehicleState
import spock.lang.Specification
import spock.lang.Unroll

class CarSpec extends Specification {
    static Car car
    def setup(){
        car = new Car()
    }

    @Unroll
    def "運転開始できる"() {
        given:
        car.start()
        expect:
        car.getState() == VehicleState.START
    }

    @Unroll
    def "運転停止する"() {
        given:
        car.stop()
        expect:
        car.getState() == VehicleState.STOP
    }

    //flyは実装から消えたのでテストする必要がない
    /*@Unroll
    def "飛行する"() {
        when:
        car.fly()
        then:
        thrown(Exception)
    }*/
}
