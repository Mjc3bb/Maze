package windowing;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainWindow extends Frame {

	public MainWindow() throws HeadlessException {
		super();
		start();
		setup();
		finalize();
	}

	protected void setup() {
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu solveMenu = new SolveMenu();
		
		
		
		menuBar.add(solveMenu);
		
		setJMenuBar(menuBar);

	}

}
