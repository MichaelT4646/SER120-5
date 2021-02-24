import java.awt.Color;

import wheels.users.Ellipse;

public class Body {

	private DraggableEllipse segment1;
	private DraggableEllipse segment2;
	
	public Body(int x, int y, Worm worm) {
		segment1 = new DraggableEllipse(worm);
		segment1.setSize(80, 80);
		segment1.setColor(Color.green);
		
		segment2 = new DraggableEllipse(worm);
		segment2.setSize(80, 80);
		segment2.setColor(Color.green);
		
		setLocation(x, y);
	}
	
	public void setLocation(int x, int y) {
		segment1.setLocation(x + 90, y + 20);
        segment2.setLocation(x + 160, y + 20);
	}
}
