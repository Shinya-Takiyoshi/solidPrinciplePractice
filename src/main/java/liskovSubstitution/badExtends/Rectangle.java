package liskovSubstitution.badExtends;

import lombok.Setter;

@Setter
public class Rectangle {
    private Integer width = 0;
    private Integer height = 0;

    public Integer getArea(){
        return this.width * this.height;
    }
}
