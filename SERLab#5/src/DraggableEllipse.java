import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class DraggableEllipse extends Ellipse {
	
	private int _previousMouseX;
	private int _previousMouseY;
	private Worm _worm;

	public DraggableEllipse(Worm worm) {
		_worm = worm;
	}

	public void mousePressed(MouseEvent e) {
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		
		//calculate distance the mouse moved
		int dx = e.getX() - _previousMouseX;
		int dy = e.getY() - _previousMouseY;
		
		//setLocation needs to be called
		int newLocationX = _worm.getXLocation() + dx;
		int newLocationY = _worm.getYLocation() + dy;
		_worm.setLocation(newLocationX,newLocationY);
		
		//updating the 2 variables
		_previousMouseX = e.getX();
		_previousMouseY = e.getY();
	}

}
