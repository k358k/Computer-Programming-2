import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import snippet.EmployeeMainPage;


public class MainPage implements ActionListener{

	 private static JFrame f = new JFrame(); 
	 private static JPanel bpanel;
	 private static JPanel Mpanel;
	 private static JLabel Mlabel;
	 private static JButton HRbutton;
	 private static JButton Accountsbutton;
	 private static JButton Ebutton;
	 private static JLabel icon;

	
	MainPage(){
		
		
		
	HRbutton = new JButton("HR Personnel");
	HRbutton.addActionListener(this);
	HRbutton.setBounds(580,160,330,100);
	HRbutton.setFocusable(false);// removes the border of the text on the button 
	HRbutton.setFont(new Font ("STYLUS", Font.BOLD, 18) );


	Accountsbutton = new JButton("Accounts/ Payroll Personnel");
	Accountsbutton.addActionListener(this);
	Accountsbutton.setBounds(580,275,330,100);
	Accountsbutton.setFocusable(false);// removes the border of the text on the button
	Accountsbutton.setFont(new Font ("STYLUS", Font.BOLD, 18) );

		
	Ebutton = new JButton("Employees");
	Ebutton.addActionListener(this);
	Ebutton.setBounds(580,390,330,100);
	Ebutton.setFocusable(false);// removes the border of the text on the button
	Ebutton.setFont(new Font ("STYLUS", Font.BOLD, 18) );

		
		
	Mlabel = new JLabel ("Departments");
	Mlabel.setBounds(600,-450,500,1000);
	Mlabel.setForeground(new Color (0xe3c1fe));  
	Mlabel.setFont(new Font("broadway", Font.PLAIN, 40));

		
	Mpanel = new JPanel();
	Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
	Mpanel.setBounds(500,0,500,100);
		
	
	bpanel = new JPanel();
	bpanel.setBackground(new Color(0xF0F0F0));	
	bpanel.setBounds(500,0,500, 1000);
	
		
	
		
	f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
    f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
    f.setLayout(null);// allows you to resize the panels? ** CHECK!! **


    f.setResizable(false); // prevent frame from being resized
    f.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)
    f.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
	// red, green, blue

	f.add(Mlabel);	
	f.add(Mpanel);
	
	f.add(HRbutton);
	f.add(Accountsbutton);
	f.add(Ebutton);
	
	f.add(bpanel);
	
	icon = new JLabel();
	icon.setBounds(-120,0,700,670);
    ImageIcon image = new ImageIcon("img.png");
    Image img = image.getImage();
    Image imgScale = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon finalImage = new ImageIcon(imgScale);

    f.setIconImage(image.getImage()); // this will change the icon on the title bar
    f.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
       // red, green, blue

    icon.setIcon(finalImage);

    f.add(icon);
	
	
	f.setVisible(true); // makes the frame visible****
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
/*		System.out.println("working");
		String user = fullnameText.getText();
		String password = passwordText.getText();
		String role = roleText.getText();
		System.out.println(user + " ." + password + " ," + role);  */
		
		
		   if(e.getSource()==Ebutton){
	            f.dispose(); // exits the previous frame
	            new EmployeeMainPage(); // ** this is calling out the InfoPage class   **

			
		} else if(e.getSource()== HRbutton) {
			  f.dispose();			
			  new HRpage();
			
		} else if(e.getSource()== Accountsbutton) {
			  f.dispose();			
			  new AccountsPage();
		}
	}



}
