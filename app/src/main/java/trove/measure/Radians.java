package trove;
import static java.lang.Math.PI;

public class Radians extends Angle {
	public Radians(double radians){
		super(radians);
	}

	public Degrees toDegrees(){
		return new Degrees(this.measure / PI * 180);
	}
}