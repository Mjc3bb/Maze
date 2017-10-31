package windowing;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	private String name;
	public Frame() throws HeadlessException {
		super();
		name="";
	}

	public Frame(GraphicsConfiguration arg0) {
		super(arg0);
	}

	public Frame(String arg0) throws HeadlessException {
		super(arg0);
		name=arg0;
	}

	public Frame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
	}
	
	protected void start() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	protected void setup() {
		JMenuBar MenuBar = new JMenuBar();
		setJMenuBar(MenuBar);
	}
	
	protected void finalize() {
		pack();
		validate();
		setVisible(true);
	}

}
