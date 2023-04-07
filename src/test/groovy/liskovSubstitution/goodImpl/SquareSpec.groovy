package liskovSubstitution.goodImpl

import spock.lang.Specification
import spock.lang.Unroll

class SquareSpec extends Specification {
    @Unroll
    def "RectangleTest"() {
        given:
        Shape rectangle = new Rectangle()
        rectangle.setHeight(3)
        rectangle.setWidth(4)
        expect:
        rectangle.getArea() == 12
    }

    @Unroll
    def "SquareTest"() {
        given:
        Shape square = new Square()
        square.setLength(3)
        expect:
        square.getArea() == 9
    }
}
