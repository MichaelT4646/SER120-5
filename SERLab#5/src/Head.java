import java.awt.Color;

import wheels.users.Ellipse;

public class Head {

	private DraggableEllipse face;
	private DraggableEllipse eye1;
	private DraggableEllipse eye2;
	
	public Head(int x, int y, Worm worm) {
		face = new DraggableEllipse(worm);
		face.setColor(Color.red);
		face.setSize(100, 100);
		
		eye1 = new DraggableEllipse(worm);
		eye1.setColor(Color.black);
		eye1.setSize(10, 10);
		
		eye2 = new DraggableEllipse(worm);
		eye2.setColor(Color.black);
		eye2.setSize(10, 10);
		
		setLocation(x, y);
	}
	
	public int getXLocation() {
		return face.getXLocation();
	}
	
	public int getYLocation() {
		return face.getYLocation();
	}
	
	public void setLocation(int x, int y) {
		face.setLocation(x, y);
        eye1.setLocation(face.getXLocation() + 30, face.getYLocation() + 30); 
        eye2.setLocation(face.getXLocation() + 60, face.getYLocation() + 30);
	}
	
}
