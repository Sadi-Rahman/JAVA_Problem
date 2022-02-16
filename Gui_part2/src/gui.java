import javax.swing.*;
import javax.awt.*;

public class gui {

	public static void main(String[] args) {
		JFrame frame = new JFrame("New Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		JButton button = new JButton("PRESS");
		frame.getContentPane().add(button);
		frame.setVisible(true);

	}

}
