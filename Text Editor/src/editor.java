import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;


public class editor extends JFrame implements ActionListener {
	 
		JTextArea t;
	    JFrame f;
	

	public editor() {
		
		f = new JFrame("editor");
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			MetalLookAndFeel.setCurrentTheme(new OceanTheme());
		}
		catch (Exception e) {}
	}
	t = new JTextArea();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
