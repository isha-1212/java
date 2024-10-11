
import java.util.*;

interface AdvancedArithmetic {

    int divisor_sum(int n);
    //we can define method here if and only if when the default keyword is used.
}

class calledMyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                sum += i;
            }
        }
        return sum;

    }
}

public class demo2 {

    public static void main(String[] args) {
        calledMyCalculator c = new calledMyCalculator();
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = c.divisor_sum(n);
        System.out.println("sum of divisors is:  " + result);

    }

}
