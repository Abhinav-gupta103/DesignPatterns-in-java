package Prototype_Pattern;

// Step 2: Concrete Class extending Shape
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Squares");
    }

}
