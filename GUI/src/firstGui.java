import javax.swing.*;


public class firstGui {

	public static void main(String[] args) {
		JFrame frame = new JFrame ("First Gui"); 
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		JButton button = new JButton("Click");
		frame.getContentPane().add(button);
		frame.setVisible(true);

	}

}
