package Prototype_Pattern;

public class Main {
    public static void main(String[] args) {
        // Load the shaped into cache(prototype registry)
        ShapeCache.loadCache();

        // Get and clone shapes from the cache
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
        clonedShape3.draw();
    }
}
