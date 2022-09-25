public class Circle implements Shape {
    private String shapeName;

    public Circle(String shapeName) {
        this.shapeName = shapeName;
   }

   @Override
   public String getShapeName() {
        return shapeName;
    }
}
