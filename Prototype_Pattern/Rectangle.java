package Prototype_Pattern;

// Step 2: Concrete Class extending Shape
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

}
