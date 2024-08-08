
public class CNum {

    private double r;
    private double i;

    public CNum(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public double getI() {
        return i;
    }

    public CNum add(CNum o) {
        return new CNum(this.r + o.r, this.i + o.i);
    }

    public CNum sub(CNum o) {
        return new CNum(this.r - o.r, this.i - o.i);
    }

    public CNum mul(CNum o) {
        double rp = this.r * o.r - this.i * o.i;
        double ip = this.r * o.i + this.i * o.r;
        return new CNum(rp, ip);
    }

    public CNum div(CNum o) {
        double den = o.r * o.r + o.i * o.i;
        double rp = (this.r * o.r + this.i * o.i) / den;
        double ip = (this.i * o.r - this.r * o.i) / den;
        return new CNum(rp, ip);
    }

    @Override
    public String toString() {
        if (i >= 0) {
            return r + " + " + i + "i";
        } else {
            return r + " - " + (-i) + "i";
        }
    }

    public static void main(String[] args) {
        CNum n1 = new CNum(4, 5);
        CNum n2 = new CNum(2, 3);

        CNum sum = n1.add(n2);
        CNum diff = n1.sub(n2);
        CNum prod = n1.mul(n2);
        CNum quot = n1.div(n2);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Prod: " + prod);
        System.out.println("Quot: " + quot);
        System.out.println("\n ISHA PATEL_23DIT045");
    }
}
