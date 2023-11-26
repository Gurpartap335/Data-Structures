package lecture.core.oop.constructor;

// copy constructor
public class CopyConstructor {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 45);

        Complex c2 = new Complex(c1);

        Complex c3 = c2;
        System.out.println(c2);
    }
}

class Complex {
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(Complex c) {
        System.out.println("Copy Constructor called");
        re = c.re;
        im = c.im;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
