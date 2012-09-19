package util.bamreading;

/**
 * Computes total read depth at the current position
 * @author brendan
 *
 */
public class DepthComputer implements ColumnComputer {

	private final Double[] value = new Double[1];
	
	@Override
	public String getName() {
		return "total.depth";
	}
	
	@Override
	public Double[] computeValue(AlignmentColumn col) {
		value[0] = (double)col.getDepth();
		return value;
	}

}
