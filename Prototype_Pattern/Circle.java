package Prototype_Pattern;

// Step 2: Concrete Class extending Shape
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
