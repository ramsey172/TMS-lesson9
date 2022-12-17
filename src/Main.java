import Ex1.Vector2D;
import Ex1.Vector3D;
import Ex2.VectorMulti;

public class Main {
    public static void main(String[] args) {

        // 2D/3D

        Vector2D v1 = new Vector2D(2, 4);
        Vector2D v2 = new Vector2D(5, 7);

        //Vector3D v1 = new Vector3D(2, 5, 7);
        //Vector3D v2 = new Vector3D(4, 6, 9);

        System.out.println("Is equal?");
        System.out.println(v1.equals(v2));
        System.out.println("Sum:");
        System.out.println(v1.add(v2));
        System.out.println("Subtract:");
        System.out.println(v1.subtract(v2));
        System.out.println("Scalar multiply:");
        System.out.println(v1.scalarMultiply(v2));

        System.out.println("Random vectors:");
        int count = 3;
        Vector2D[] vectors = Vector2D.getRandomVectors(count);
        //Vector3D[] vectors = Vector3D.getRandomVectors(count);
        for (Vector2D vector : vectors) {
            vector.getInfo();
        }

        // multidimensional

        VectorMulti v1Multi = new VectorMulti(2, 4, 4, 4, 4, 7);
        VectorMulti v2Multi = new VectorMulti(2, 4, 4, 4, 4, 7);

        System.out.println("Is equal?");
        System.out.println(v1Multi.equals(v2Multi));
        System.out.println("Sum:");
        System.out.println(v1Multi.add(v2Multi));
        System.out.println("Subtract:");
        System.out.println(v1Multi.subtract(v2Multi));
        System.out.println("Scalar multiply:");
        System.out.println(v1Multi.scalarMultiply(v2Multi));

        System.out.println("Random vectors:");
        int count2 = 3;
        VectorMulti[] vectorsMulti = VectorMulti.getRandomVectors(count2);
        for (VectorMulti vector : vectorsMulti) {
            vector.getInfo();
        }
    }
}