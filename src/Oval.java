public class Oval implements Shape {
    private String shapeName;

    public Oval(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
}
