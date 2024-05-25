package snippet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GrossWagePage implements ActionListener{

	private static	JFrame f ; 
	JPanel bpanel;
	JLabel Mlabel;
	JPanel Mpanel;
	JButton CloseButton;
	JLabel GWLabel;
	JTextField GWText;
	JButton backbutton;
	

	
	GrossWagePage(){
		
		
		GWLabel = new JLabel ("Gross Wage :");
		GWLabel.setBounds(320,200,165,40);
		GWLabel.setFont(new Font("STYLUS", Font.BOLD, 20));

		GWText = new JTextField();
		GWText.setBounds(400,250,185,30);
	
	
		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(40,35,900,590);
		bpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

		
		Mlabel = new JLabel ("Gross Wage Page");
		Mlabel.setBounds(265,43,600,85);
        Mlabel.setForeground(new Color (0xe3c1fe));
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 55));
		
		Mpanel = new JPanel();
        Mpanel.setBackground(new Color(0x55009b));
									// hexadecimal values for color
		Mpanel.setBounds(40,35,900,110);
		Mpanel.setBorder(BorderFactory.createLineBorder((new Color(0x1f0039)),3));

	  	backbutton = new JButton("Back");
    	backbutton.addActionListener(this);
    	backbutton.setBounds(160,520,100,35);
    	backbutton.setFocusable(false);// removes the border of the text on the button
    	backbutton.setFont(new Font("Stylus", Font.PLAIN, 15));

		
    	CloseButton = new JButton("Done");
		CloseButton.addActionListener(this);
		CloseButton.setBounds(760,520,100,35);
		CloseButton.setFocusable(false);// removes the border of the text on the button
		CloseButton.setFont(new Font("Stylus", Font.PLAIN, 15));
	
		
		
		ImageIcon image = new ImageIcon("img.png");// create the image icon

		f = new JFrame();
		f.setTitle("MotorPH System"); // sets the tile of the f (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the f closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		f.setResizable(false); // prevent f from being resized
		f.setSize(1000,700); //sets the size of the f (x and y-dimension of the f)
		f.setVisible(true); // makes the f visible****
		f.getContentPane().setBackground(new Color(0xf2e2fe)); // sets the color of the background
		
		f.setIconImage(image.getImage()); // this will set/change the image icon on the title frame
		
		
		f.add(Mlabel);
		f.add(Mpanel);
		f.add(CloseButton);
		f.add(GWLabel);
		f.add(GWText);
		f.add(backbutton);
		f.add(bpanel);
	}



	@Override
    public void actionPerformed(ActionEvent e) {

		  if(e.getSource()==CloseButton){ //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
			  f.dispose(); 
			
		  

		} else if(e.getSource()== backbutton) {
			f.setVisible(false);
			EmployeeMainPage EmployeeMP = new EmployeeMainPage();
			EmployeeMP.showWindow();
			
			
			
		}
	}
	
}
