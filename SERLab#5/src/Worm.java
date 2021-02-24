import java.awt.Color;

import wheels.users.Ellipse;

public class Worm {

	private Head head;
	private Body body;

	
	public Worm(int x, int y) {
		head = new Head(x, y, this);
		body = new Body(x, y, this);
	}
	
	public int getXLocation() {
		return head.getXLocation();
	}
	
	public int getYLocation() {
		return head.getYLocation();
	}
	
    public void setLocation(int x, int y) {
        head.setLocation(x, y);
        body.setLocation(x, y);
    }
}
