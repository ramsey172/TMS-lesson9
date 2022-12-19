package Ex1;

public class Vector2D {
    private double a;
    private double b;

    private double length;

    private final String INFO = "vector in 2D coordinate system";

    public Vector2D(double a, double b) {
        this.a = a;
        this.b = b;
        setLength();
    }

    private void setLength() {
        length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply(Vector2D vector) {
        return a * vector.getA() + b * vector.getB();
    }

    public Vector2D add(Vector2D vector) {
        a += vector.getA();
        b += vector.getB();
        return this;
    }

    public Vector2D subtract(Vector2D vector) {
        a -= vector.getA();
        b -= vector.getB();
        return this;
    }

    public static Vector2D[] getRandomVectors(int count) {
        Vector2D[] result = new Vector2D[count];
        int randomA;
        int randomB;
        for (int n = 0; n < count; n++) {
            randomA = (int) (Math.random() * 10);
            randomB = (int) (Math.random() * 10);
            result[n] = new Vector2D(randomA, randomB);
        }
        return result;
    }

    public boolean equals(Vector2D vector) {
        return a == vector.getA() && b == vector.getB();
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