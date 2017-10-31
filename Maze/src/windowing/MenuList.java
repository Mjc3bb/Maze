package windowing;

import javax.swing.Action;
import javax.swing.JMenu;

public abstract class MenuList extends JMenu {

	private static final long serialVersionUID = -4492931346169770050L;

	public MenuList() {
		run();
	}

	public MenuList(String s) {
		super(s);
		run();
	}

	public MenuList(Action a) {
		super(a);
		run();
	}

	public MenuList(String s, boolean b) {
		super(s, b);run();
	}

	public void run() {
		
	}
	
}
