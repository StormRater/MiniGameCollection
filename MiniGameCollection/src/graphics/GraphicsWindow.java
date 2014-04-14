package graphics;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsWindow extends Applet implements Runnable, ActionListener {

	private Graphics classGraphic;
	private final String[] resolutions = { "640x480", "800x600", "1024x600", 
											"1024x768", "1152x864", "1280x720",
											"1280x768", "1280x800", "1280x960",
											"1280x1024", "1360x768", "1366x768",
											"1400x1050", "1440x900", "1600x900",
											"1600x1200", "1680x1050", "1920x1080",
											"1920x1200", "2048x1152", "2560x1440",
											"2560x1600"};
	private Choice n;
	private Button okButton;
	
//	Checkbox resVGA, resSVGA, resWSVGA, resXGA, resXGAp,
//			resWXGA, resWXGA2, resWXGA3, resUVGA, resSXGA,
//			reHD1, resHD2, resSXGAp, resWXGAp, resHDp, 
//			resUXGA, resWSXGAp, resFHD, resWUXGA, resQWXGA,
//			resWQHD, resWQXGA;
	
	
	public void init()
	{
		n = new Choice();
		for(String s: resolutions)
			n.add(s);
		this.retrieveResolution(n.getSelectedItem(),0);
		
		this.setSize(300, 500);
		//get the resolution and set to WIDTH and HEIGHT
		this.setLocation(3*(WIDTH/8),3*(HEIGHT/8));
	} 
	private GraphicsWindow(){}
	
	public GraphicsWindow(Graphics g)
	{
		this.classGraphic = g;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	private void retrieveResolution(String namedChoice, int placement)
	{
		
		switch(namedChoice){
		case "dsf": break;
		case "o": break;
		}
	}
	
	public void paint(Graphics g)
	{
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
