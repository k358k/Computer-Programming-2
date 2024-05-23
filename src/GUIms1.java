import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
public class GUIms1 {

	public static void main(String[] args) {
		
		
	JLabel label = new JLabel();
	label.setText("Enter");
	label.setFont(new Font("Broadway",Font.PLAIN,20));
		
		
	JLabel plabel = new JLabel();
	plabel.setText("Password");
	plabel.setFont(new Font("Broadway",Font.PLAIN,15));

	
	JLabel elabel = new JLabel();
	elabel.setText("Email");
	elabel.setFont(new Font("Broadway",Font.PLAIN,15));

	
	JLabel rlabel = new JLabel();
	rlabel.setText("Role");
	rlabel.setFont(new Font("Broadway",Font.PLAIN,15));
	//rlabel.setVerticalAlignment(JLabel.CENTER);
	//rlabel.setHorizontalAlignment(JLabel.CENTER);
	
	JLabel Mlabel = new JLabel();
	Mlabel.setText("Motor PH System");
	Mlabel.setFont(new Font("Broadway",Font.PLAIN,30));
	//Mlabel.setHorizontalAlignment(JLabel.CENTER);
	Mlabel.	setBounds(50,80,160,30);

	
	JPanel bpanel = new JPanel();
	bpanel.setBackground(new Color(0xF0F0F0));
	bpanel.setBounds(50,40,380,390);

	
	JPanel gpanel = new JPanel();
	gpanel.setBackground(new Color(0xC1C7C9));
	gpanel.setBounds(190,330,100,40);
	
	JPanel ppanel = new JPanel();
	ppanel.setBackground(new Color(0xD4D4D4));
	ppanel.setBounds(163,265,150,40);
	
	JPanel epanel = new JPanel();
	epanel.setBackground(new Color(0xD4D4D4));
	epanel.setBounds(163,215,150,40);
		
	JPanel rpanel = new JPanel();
	rpanel.setBackground(new Color(0xD4D4D4));
	rpanel.setBounds(163,165,150,40);
	
	JPanel Mpanel = new JPanel();
	Mpanel.setBackground(new Color(0xD4D4D4));
	Mpanel.setBounds(65,55,350,98);
				//left-right on the frame, up-down on the frame, length of the panel, width of the panel
	
	
	
	
		
	JFrame f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
	f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
	f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
	f.setResizable(false); // prevent frame from being resized
	f.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
	f.setVisible(true); // makes the frame visible****
						// elements that you want to be visible in your frame should be put before this code so that it will be visible in the frame
	//	f.add(l);// adds the label on the frame****
	f.add(gpanel); // adds the panel to the frame *****
	gpanel.add(label); // adds the label to the panel *****
	f.add(ppanel); 
	ppanel.add(plabel);
	f.add(epanel);
	epanel.add(elabel);
	f.add(rpanel);
	rpanel.add(rlabel);
	f.add(Mpanel);
	Mpanel.add(Mlabel);
	f.add(bpanel);

	
	
	
	ImageIcon image = new ImageIcon("image.jpg");
	f.setIconImage(image.getImage()); // this will change the icon on the title bar
	f.getContentPane().setBackground(new Color(0xcfe2f3)); // sets the color of the background
											// red, green, blue
	// MyFrame fr = new MyFrame(); 
		// "MyFrame null(name)" is nor really required but it is needed if you want to change something in the child class that you have created

	}
	
		
}