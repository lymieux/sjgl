package trove;
import trove.measure.Radians;
import trove.measure.Degrees;

public class Testing {

    public static void main(String[] args) {
        Radians rad = new Radians(java.lang.Math.PI);
        Degrees deg = new Degrees(180.0);

        System.out.println("Rad pure: " + rad.getMeasure() + " convert: " + rad.toDegrees().getMeasure());
        System.out.println("Deg pure: " + deg.getMeasure() + " convert: " + deg.toRadians().getMeasure());
    }
}