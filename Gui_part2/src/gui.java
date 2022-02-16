import javax.swing.*;
import java.awt.*;


public class gui {

	public static void main(String[] args) {
		JFrame frame = new JFrame("New Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JButton button = new JButton("PRESS");
		frame.getContentPane().add(button);
		JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
       

       
      
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);

	}

}
