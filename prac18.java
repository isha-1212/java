
class Rectangle {

    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;

    }

    void printAreaOfRect() {
        int area;
        area = l * b;
        System.out.println("Area of the RECTANGLE is: " + area);
    }

    void printPerimeterOfRect() {
        int peri;
        peri = 2 * (l + b);
        System.out.println("PERIMETER of the RECTANGLE is: " + peri);
    }

}

class square extends Rectangle {

    int side;

    square(int side, int l, int b) {

        super(l, b);
        this.side = side;

    }

    void printAreaOfSquare() {
        int area;
        area = side * side;
        System.out.println("Area of the SQUARE is: " + area);
    }

    void printPerimeterOfSquare() {
        int peri;
        peri = 4 * side;
        System.out.println("PERIMETER of the SQUARE is: " + peri);
    }

}

public class demo {

    public static void main(String[] args) {

        square[] s = new square[5];
        s[0] = new square(10, 20, 30);
        s[1] = new square(100, 200, 300);
        s[2] = new square(110, 220, 350);
        s[3] = new square(160, 720, 50);
        s[4] = new square(10, 220, 350);

        for (int i = 0; i < s.length; i++) {
            s[i].printAreaOfRect();
            s[i].printPerimeterOfRect();
            s[i].printAreaOfSquare();
            s[i].printPerimeterOfSquare();
        }

    }

}
