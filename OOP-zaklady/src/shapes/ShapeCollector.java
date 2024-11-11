package shapes;

public class ShapeCollector {

    private Rectangle rectangle;

    public ShapeCollector(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void printRectangle() {
        System.out.println("ShapeCollector rectangle width: "
        + this.rectangle.getWidth() + ", height : "
        + this.rectangle.getHeight()
        );
    }
}
