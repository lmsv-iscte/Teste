/**
 * 
 */
package battleship;

/**
 * @author adrianolopes
 *
 */
public class Barge extends Ship {

	private static final int SIZE = 1;
	private static final String NAME = "Barca";

	/**
	 * @param bearing - barge bearing
	 * @param pos     - upper left position of the barge
	 */
	public Barge(Compass bearing, IPosition pos) throws IllegalArgumentException {
		super(Barge.NAME, bearing, pos);
		if (bearing == null || pos == null)
			throw new IllegalArgumentException("ERROR! invalid bearing for the barge");
		else
			positions.add(new Position(pos.getRow(), pos.getColumn()));
	}

	@Override
	public int getSize() {
		return SIZE;
	}

}
