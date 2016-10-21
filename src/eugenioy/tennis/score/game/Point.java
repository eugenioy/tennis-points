package eugenioy.tennis.score.game;

public enum Point {
	p40(null, true, "40"), 
	p30(p40, false, "30"), 
	p15(p30, false,"15"), 
	p0(p15, false, "0");
	
	private Point next;
	private boolean isGamePoint;
	private String representation;

	private Point(Point next, boolean isGamePoint, String representation) {
		this.next = next;
		this.isGamePoint = isGamePoint;
		this.representation = representation;
	}

	public String getRepresentation() {
		return representation;
	}

	public boolean isGamePoint() {
		return isGamePoint;
	}

	public Point getNext() {
		return next;
	}
}
