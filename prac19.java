
class Shape {

    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {

    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {

    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {

    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class prac19 {

    public static void main(String[] args) {
        Square square = new Square();

        square.printShape();       // Calling method from Shape class
        square.printRectangle();   // Calling method from Rectangle class
    }
}
