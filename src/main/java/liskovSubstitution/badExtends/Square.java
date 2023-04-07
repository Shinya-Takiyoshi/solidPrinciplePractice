package liskovSubstitution.badExtends;

public class Square extends Rectangle {
    @Override
    public void setWidth(Integer width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(Integer height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
