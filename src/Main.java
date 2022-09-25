public class Main {
    public static void main(String[] args) {
        Shape quad1 = new Quad("Quad 1");
        Shape circle1 = new Circle("Circle 1");
        Shape triangle1 = new Triangle("Triangle 1");
        Shape octagon1 = new Octagon("Octagon 1");
        Shape oval1 = new Oval("Oval 1");

        ShapeNamePrinter.print(quad1);

    }
}