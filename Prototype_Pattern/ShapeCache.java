package Prototype_Pattern;

import java.util.Hashtable;

// Step 3: Class to get the prototype
public class ShapeCache {

    // HashMap to store the shpa objects
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    // Method to retrieve shape by id
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);

        return (Shape) cachedShape.clone();
    }

    // Load some shaped into cache
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
