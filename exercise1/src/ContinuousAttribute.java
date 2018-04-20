public class ContinuousAttribute extends Attribute {
    private double max; // superior end of the range
    private double min; // inferior end of the range
    
    public ContinuousAttribute(String name, int  index, double min, double max) {
    	super(name, index); // invokes Attribute's constructor
    	this.min = min;
    	this.max = max;
    }
    
    double getScaledValue(double v) {
    	return (v - min) / (max - min);
    }
    
}
