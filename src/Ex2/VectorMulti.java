package Ex2;

public class VectorMulti {
    private double[] coords;
    private double length;

    private final String INFO = "vector in multidimensional coordinate system";

    public VectorMulti(double... coords) {
        this.coords = coords;
        setLength();
    }

    private void setLength() {
        double sumOfSquares = 0;
        for (double coord : coords) {
            sumOfSquares += Math.pow(coord, 2);
        }
        length = Math.sqrt(sumOfSquares);
    }

    public double[] getCoords() {
        return coords;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply(VectorMulti vector) {
        double res = 0;
        for (int n = 0; n < coords.length; n++) {
            res += coords[n] * vector.getCoords()[n];
        }
        return res;
    }

    public VectorMulti add(VectorMulti vector) {
        for (int n = 0; n < coords.length; n++) {
            coords[n] += vector.getCoords()[n];
        }
        return this;
    }

    public VectorMulti subtract(VectorMulti vector) {
        for (int n = 0; n < coords.length; n++) {
            coords[n] -= vector.getCoords()[n];
        }
        return this;
    }

    public static VectorMulti[] getRandomVectors(int count) {
        VectorMulti[] result = new VectorMulti[count];
        int randomCoordsCount;
        double[] randomCoords;
        for (int n = 0; n < count; n++) {
            randomCoordsCount = (int) (Math.random() * 10);
            randomCoords = new double[randomCoordsCount];
            for (int k = 0; k < randomCoordsCount; k++) {
                randomCoords[k] = (int) (Math.random() * 10);
            }
            result[n] = new VectorMulti(randomCoords);
        }
        return result;
    }

    public boolean equals(VectorMulti vector) {
        double[] vectorCoords = vector.getCoords();
        if(coords.length != vectorCoords.length ){
            return false;
        }
        for (int n=0; n<coords.length;n++){
            if(coords[n] != vectorCoords[n]){
                return false;
            }
        }
        return true;
    }

    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String[] coordsStringArray = new String[coords.length];
        for(int n=0;n<coords.length;n++){
            coordsStringArray[n] = String.valueOf(coords[n]);
        }
        return "Ex2.Vector2D{" +
                "coords= {" + String.join(", ",coordsStringArray) + "}"+
                ", length=" + length +
                ", INFO=" + INFO +
                '}';
    }
}