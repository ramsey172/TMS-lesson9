package Ex1;

public class Vector3D {
    private double a;
    private double b;
    private double c;

    private double length;

    private final String INFO = "vector in 3D coordinate system";

    public Vector3D(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.b = c;
        setLength();
    }

    private void setLength() {
        length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getLength() {
        return length;
    }

    public Vector3D scalarMultiply(Vector3D vector) {
        a *= vector.getA();
        b *= vector.getB();
        c *= vector.getC();
        return this;
    }

    public Vector3D add(Vector3D vector) {
        a += vector.getA();
        b += vector.getB();
        c += vector.getC();
        return this;
    }

    public Vector3D subtract(Vector3D vector) {
        a -= vector.getA();
        b -= vector.getB();
        c -= vector.getC();
        return this;
    }

    public static Vector3D[] getRandomVectors(int count) {
        Vector3D[] result = new Vector3D[count];
        int randomA;
        int randomB;
        int randomC;
        for (int n = 0; n < count; n++) {
            randomA = (int) (Math.random() * 10);
            randomB = (int) (Math.random() * 10);
            randomC = (int) (Math.random() * 10);
            result[n] = new Vector3D(randomA, randomB, randomC);
        }
        return result;
    }

    public boolean equals(Vector3D vector) {
        return a == vector.getA() && b == vector.getB() && c == vector.getC();
    }

    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ex1.Vector2D{" +
                "a=" + a +
                ", b=" + b +
                ", length=" + length +
                ", INFO=" + INFO +
                '}';
    }
}