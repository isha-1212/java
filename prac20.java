
class Degree {

    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {

    void graduate() {
        System.out.println("I m undergraduate");
    }
}

class Postgraduate extends Degree {

    void graduate() {
        System.out.println("I m postgraduate");
    }
}

public class prac20 {

    public static void main(String[] args) {
        Degree d = new Degree();
        d.getdegree();
        Undergraduate u = new Undergraduate();
        u.graduate();
        Postgraduate p = new Postgraduate();
        p.graduate();

    }

}
