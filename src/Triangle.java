public class Triangle implements Shape {
    private String shapeName;

    public Triangle(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
}
