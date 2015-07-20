package extrogene.gamedev.linegame.view.draw;

public class Line {

	public float startX, startY;
	public float stopX, stopY;
	public int nolines;

	public Line(float startX, float startY, float stopX, float stopY,int nolines) {
		for (int i = 0; i < LindrawView.numberofdots; i++) {

			this.startX = startX;

			this.startY = startY;

			this.stopX = stopX;

			this.stopY = stopY;
			
			this.nolines = nolines;
		}
	}

	public Line(float startX, float startY) { // for convenience
		this(startX, startY, startX, startY,1);
	}

}
