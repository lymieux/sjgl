package trove.measure;

public abstract class Angle {
	protected final double measure;

	public Angle(final double measure){
		this.measure = measure;
	}

	public double getMeasure(){
		return measure;
	}
}