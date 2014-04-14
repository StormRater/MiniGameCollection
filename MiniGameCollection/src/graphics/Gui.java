package graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;

import java.awt.BorderLayout;

import javax.swing.JSlider;

import java.awt.Choice;
import java.awt.List;
import java.awt.Scrollbar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Gui {

	private JFrame frame;

	private final String[] resolutions = { "640x480", "800x600", "1024x600", 
			"1024x768", "1152x864", "1280x720",
			"1280x768", "1280x800", "1280x960",
			"1280x1024", "1360x768", "1366x768",
			"1400x1050", "1440x900", "1600x900",
			"1600x1200", "1680x1050", "1920x1080",
			"1920x1200", "2048x1152", "2560x1440",
			"2560x1600"};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu = new JMenu("Select Your Screen Resolution");
		menuBar.add(mnNewMenu);
		for(String s: resolutions)
			mnNewMenu.add(new JMenuItem(s));
	}

}
