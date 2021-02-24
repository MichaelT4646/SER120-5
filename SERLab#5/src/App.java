
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import wheels.users.Frame;

public class App extends Frame {

	private Worm worm;

	public App() {
		worm = new Worm(220, 180);
	}

	public static void main(String[] args) {
		new App();

		_dp.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX() + ", " + e.getY());
			}
		});
	}

}