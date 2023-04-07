package liskovSubstitution.goodImpl;

import lombok.Setter;

@Setter
public class Rectangle implements Shape{
    private Integer width = 0;
    private Integer height = 0;

    @Override
    public Integer getArea(){
        return this.width * this.height;
    }
}
