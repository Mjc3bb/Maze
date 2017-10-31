package windowing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JMenuItem;

public class SolveMenu extends MenuList {

	private static final long serialVersionUID = 7126701980429040380L;

	public SolveMenu() {
		super("Solve...");
	}

	public void run() {
		JMenuItem loadMaze = new JMenuItem("Load a maze...");
		loadMaze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Loading");
			}
		});
		add(loadMaze);
	}

}
