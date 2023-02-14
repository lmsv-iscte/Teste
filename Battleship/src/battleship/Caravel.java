/**
 * 
 */
package battleship;

/**
 * @author adrianolopes
 *
 */
public class Caravel extends Ship {
	//ghkkkilil
	
	private static final int SIZE = 2;
	private static final String NAME = "Caravela";
	
	/**
	 * @param bearing
	 * @param pos
	 */
	public Caravel(Compass bearing, IPosition pos) throws IllegalArgumentException {
		super(Caravel.NAME, bearing, pos);
		
		if (bearing == Compass.NORTH || bearing == Compass.SOUTH)
			for (int r = 0; r < SIZE; r++)
				positions.add(new Position(pos.getRow()+r, pos.getColumn()));
		else if (bearing == Compass.EAST || bearing == Compass.WEST)
			for (int c = 0; c < SIZE; c++)
				positions.add(new Position(pos.getRow(), pos.getColumn()+c));
		else 
			throw new IllegalArgumentException("ERROR! invalid bearing for the caravel");
	}

	/* (non-Javadoc)
	 * @see battleship.Ship#getSize()
	 */
	@Override
	public int getSize() {
		return SIZE;
	}

}
