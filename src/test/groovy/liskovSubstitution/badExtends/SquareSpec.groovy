package liskovSubstitution.badExtends

import spock.lang.Specification

class SquareSpec extends Specification {
    private Rectangle rectangle
    private Rectangle square
    def setup(){
        rectangle = new Rectangle()
        square = new Square()
    }
    def "RectangleTest"() {
        expect:
        f(rectangle,3,4) == 12
    }

    def "SquareTest"() {
        expect:
        //3 * 4 = 12と想定したが実際は 3 * 3 = 9
        // 親クラスとは挙動が異なり利用者側からすれば想定外
        //f(square,3,4) == 12
        f(square,3,4) == 9
    }
    private static Integer f(Rectangle r,Integer width,Integer height){
        r.setHeight(height)
        r.setWidth(width)
        return r.getArea()
    }
}
