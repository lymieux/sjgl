package trove.measure;

public abstract class Angle {
	public final double measure;

	public Angle(double measure){
		this.measure = measure;
	}

	public double getMeasure(){
		return measure;
	}
}