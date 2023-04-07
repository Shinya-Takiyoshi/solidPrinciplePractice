package liskovSubstitution.goodImpl;

import lombok.Setter;

@Setter
public class Square implements Shape {
    private Integer length = 0;

    @Override
    public Integer getArea() {
        return this.length * this.length;
    }
}
