
interface Shape {

    String getColor();

    void draw();

    // Default method to display the area of the shape
    default void displayArea() {
        System.out.println("Area: " + calculateArea());
    }

    // Abstract method to be implemented by subclasses
    double calculateArea();
}

class Circle implements Shape {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {

    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + " and color " + color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Sign {

    private Shape backgroundShape;
    private String text;

    public Sign(Shape backgroundShape, String text) {
        this.backgroundShape = backgroundShape;
        this.text = text;
    }

    public void displaySign() {
        backgroundShape.draw();
        backgroundShape.displayArea();
        System.out.println("Sign Text: " + text);
    }
}

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red");
        Shape rectangle = new Rectangle(4, 6, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Campus!");
        Sign rectangleSign = new Sign(rectangle, "Event Today!");

        System.out.println("Circle Sign:");
        circleSign.displaySign();

        System.out.println("\nRectangle Sign:");
        rectangleSign.displaySign();
    }
}
