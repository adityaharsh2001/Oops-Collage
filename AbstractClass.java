// Abstract class with an abstract method
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    public void display() {
        System.out.println("Shape: " + name);
    }
}

// Concrete subclass that implements the abstract method
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Another concrete subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle A", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle B", 4.0, 6.0);

        // Display and calculate area for the circle
        circle.display();
        double circleArea = circle.calculateArea();
        System.out.println("Area of " + circle.name + ": " + circleArea);

        // Display and calculate area for the rectangle
        rectangle.display();
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of " + rectangle.name + ": " + rectangleArea);

        // Attempt to create an object of the abstract class (not allowed)
        // Shape shape = new Shape("Abstract Shape"); // This will result in a compilation error
    }
}
