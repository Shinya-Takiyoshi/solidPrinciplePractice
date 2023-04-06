package domain.model.interfaceSegregation.badInterface

import com.example.designPatternPractice.domain.model.interfaceSegregation.badInterface.AirPlane
import com.example.designPatternPractice.domain.model.interfaceSegregation.badInterface.VehicleState
import spock.lang.Specification
import spock.lang.Unroll

class AirplaneSpec extends Specification {
    static AirPlane airplane
    def setup(){
        airplane = new AirPlane()
    }

    @Unroll
    def "運転開始できる"() {
        given:
        airplane.start()
        expect:
        airplane.getState() == VehicleState.START
    }

    @Unroll
    def "運転停止する"() {
        given:
        airplane.stop()
        expect:
        airplane.getState() == VehicleState.STOP
    }

    @Unroll
    def "飛行する"() {
        given:
        airplane.fly()
        expect:
        airplane.getState() == VehicleState.FLY
    }
}
