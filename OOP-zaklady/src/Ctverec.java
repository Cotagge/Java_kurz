import shapes.Rectangle;
import shapes.ShapeCollector;

import java.awt.*;

public class Ctverec {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,5);
        System.out.println(" retangle1 width: " + rect1.getWidth() + " and height: " + rect1.getHeight());

        rect1.setHeight(150);
        rect1.setWidth(50);

        System.out.println(" retangle1 width: " + rect1.getWidth() + " and height: " + rect1.getHeight());

        ShapeCollector shapeCollector = new ShapeCollector(rect1);
        shapeCollector.printRectangle();
    }
}
