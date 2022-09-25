public class Octagon implements Shape {
    private String shapeName;

    public Octagon(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
}
