import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_AL implements ActionListener{

	
	JFrame f; 
	private static JLabel rlabel;
	private static JTextField roleText;
	private static JLabel nlabel;
	private static JTextField fullnameText;
	private static JLabel plabel;
	private static JTextField passwordText;
	private static JPanel Mpanel;
	private static JLabel Mlabel;
	private static JPanel bpanel;
	private static JButton button;
	JComboBox<String> choices;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	InfoPage info = new InfoPage(); ** Not Needed ? **
		
	/*	button = new JButton("LogIn");
		button.addActionListener(new GUI_AL());
		button.setBounds(195,330,100,25);
		button = new JButton("LogIn");
		button.addActionListener(new GUI_AL());
		button.setBounds(195,330,100,25);			
	
		JFrame f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
		f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		f.setResizable(false); // prevent frame from being resized
		f.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
		f.setVisible(true); // makes the frame visible****				*/
	
		
		// NAME **
		nlabel = new JLabel ("Username :");
		nlabel.setBounds(590,190,140,25);
		nlabel.setFont(new Font ("STYLUS", Font.PLAIN, 20) );

	
		fullnameText = new JTextField();
		fullnameText.setBounds(730,190,165,25);
		
		
		
		// PASSWORD **
		plabel = new JLabel ("Password :");
		plabel.setBounds(590,230,140,25);
		plabel.setFont(new Font ("STYLUS", Font.PLAIN, 20) );
		
	
		passwordText = new JTextField();
		passwordText.setBounds(730,230,165,25);
	
		
		
		// ROLE **
		rlabel = new JLabel ("Role :");
		rlabel.setBounds(590,270,140,25);
		// *** JLabel is for the permanent words on the frame ***
		rlabel.setFont(new Font ("STYLUS", Font.PLAIN, 20) );

	
		roleText = new JTextField();
		roleText.setBounds(730,270,165,25);	
		//*** JTextField is for the text box (where you can put answer) ***
		//*** setBounds set the boundaries of the text box ***
			
	
			
		//MotorPH sign *
		Mlabel = new JLabel ("Motor PH System");
		Mlabel.setBounds(580,-450,500,1000);
		Mlabel.setForeground(new Color (0x99FFFF));  
		Mlabel.setFont(new Font("broadway", Font.PLAIN, 40));
		
		
		Mpanel = new JPanel();
		Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
		Mpanel.setBounds(500,0,500,100);
					//left-right on the frame, up-down on the frame, length of the panel, width of the panel		
		
		
		// background panel
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(500,0,500, 1000);

		String[] roles = {"        ", "Customer Service and Relations", "Supply Chain and Logistics", "Sales & Marketing", "Account Rank and File", "Account Team Leader", "Account Manager", "Payroll Rank and File", "Payroll Team Leader", "Payroll Manager", "Accounting Head", "HR Rank and File", "HR Team Leader", "HR Manager", "IT Operations and Systems", "Chief Marketing Officer", "Chief Finance Officer", "Chief Operating Officer", "Chief Executive Officer"};
		JComboBox choices =new JComboBox(roles);
		choices.setBounds(730,270,165,25);

		
		button = new JButton("LogIn");
		button.addActionListener(new GUI_AL());
		button.setBounds(700,330,100,30);
		button.setFocusable(false);// removes the border of the text on the button
	
		// ** FRAME **
		JFrame f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
		f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **

		
		f.setResizable(false); // prevent frame from being resized
		f.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)
		f.setVisible(true); // makes the frame visible****
		
		// role part
		f.add(choices);
		f.add(rlabel);
		
		//name
		f.add(fullnameText);
		f.add(nlabel);

		//password
		f.add(passwordText);
		f.add(plabel);
		
		
		//MotorPH System sign
		f.add(Mlabel);
		f.add(Mpanel);
		
			
		// BUTTON **
		f.add(button);


		
		//background panel
		f.add(bpanel);		//all the element  should be put before this background panel so that they will show at the front of background panel			

		
			
		
		ImageIcon image = new ImageIcon("image.jpg");
		f.setIconImage(image.getImage()); // this will change the icon on the title bar
		f.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
												// red, green, blue
 


}




	@Override
	public void actionPerformed(ActionEvent e) {
/*		System.out.println("working");
		String user = fullnameText.getText();
		String password = passwordText.getText();
		String role = roleText.getText();
		System.out.println(user + " ." + password + " ," + role);  */
		
		
		if(e.getSource()==button) { //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
			InfoPage informations = new InfoPage(); // ** this is calling out the InfoPage class   **


			
			
		}
		
		
		
		
		
		
	}	
}
