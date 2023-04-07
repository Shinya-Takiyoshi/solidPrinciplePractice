package interfaceSegregation.badInterface


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

    @Unroll
    def "飛行する"() {
        when:
        car.fly()
        then:
        thrown(Exception)
    }
}
