public class Quad implements Shape {
    private String shapeName;

    public Quad(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
}
