package trove.measure;
import static java.lang.Math.PI;

public class Degrees extends Angle {
	public Degrees(double degrees){
		super(degrees);
	}

	public Radians toRadians(){
		return new Radians(this.measure / 180 * PI);
	}
}