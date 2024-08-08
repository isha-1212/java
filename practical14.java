
import java.util.Scanner;

public class Area {

    private double length;
    private double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        Area rectangle = new Area(length, width);
        double area = rectangle.returnArea();
        System.out.println("\nThe area of the rectangle is: " + area);
        System.out.println("\n BY ISHA PATEL_23DIT045");

    }

    public double returnArea() {
        return length * width;
    }
}
