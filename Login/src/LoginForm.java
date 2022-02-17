import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginForm implements ActionListener{
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passworLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] args) {
		JPanel panel =new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		userlabel = new JLabel("User");
		userlabel.setBounds(20,20,90,25);
		panel.add(userlabel);
		
		userText = new JTextField(30);
		userText.setBounds(100,20,170,25);
		panel.add(userText);
		
		passworLabel = new JLabel("Password"); 
		passworLabel.setBounds(20,50,90,25);
		panel.add(passworLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,170,25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(200,90,70,20);
		button.addActionListener(new LoginForm());
		panel.add(button);
		
		success = new JLabel();
		success.setBounds(20,120,300,25);
		panel.add(success);
		success.setText("");
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 String user = userText.getText();
		 String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if (user.equals("Akash") && password.equals("1234")) {
			success.setText("Login Successfull !!!!!");
		}
			else {
				success.setText("Login Unsuccessfull ?????");
			}
		
	}

}
