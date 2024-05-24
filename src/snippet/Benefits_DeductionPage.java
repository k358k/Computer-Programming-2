package snippet;

import java.awt.*;
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

public class Benefits_DeductionPage implements ActionListener{
	
	private static	JFrame f = new JFrame(); 
	JPanel bpanel;
	JLabel Mlabel;
	JPanel Mpanel;
	JButton CloseButton;
	JButton backbutton;
	JLabel SSSLabel;
	JTextField SSSText;
	JLabel PhilHealthlabel;
	JTextField PhilHealthText;
	
	JLabel PagIbiglabel;
	JTextField PagIbigText;
	JLabel WTaxlabel;
	JTextField WTaxText;
	JLabel AdPaylabel;
	JTextField AdPayText;
	
	
	Benefits_DeductionPage(){
		
		SSSLabel = new JLabel ("SSS :");
		SSSLabel.setBounds(250,170,200,80);
		SSSLabel.setFont(new Font("STYLUS", Font.BOLD, 20));

	
		SSSText = new JTextField();
		SSSText.setBounds(550,200,165,30);
	
		PhilHealthlabel = new JLabel ("PhilHealth :");
		PhilHealthlabel.setBounds(250,230,200,80);
		PhilHealthlabel.setFont(new Font("STYLUS", Font.BOLD, 20));

	
		PhilHealthText = new JTextField();
		PhilHealthText.setBounds(550,260,165,30);
		
		PagIbiglabel = new JLabel ("Pag - Ibig :");
		PagIbiglabel.setBounds(250,290,200,80);
		PagIbiglabel.setFont(new Font("STYLUS", Font.BOLD, 20));

	
		PagIbigText = new JTextField();
		PagIbigText.setBounds(550,320,165,30);
		
		WTaxlabel = new JLabel ("Withholding Tax :");
		WTaxlabel.setBounds(250,350,200,80);
		WTaxlabel.setFont(new Font("STYLUS", Font.BOLD, 20));

	
		WTaxText = new JTextField();
		WTaxText.setBounds(550,380,165,30);
	
		AdPaylabel = new JLabel ("Advance Payment :");
		AdPaylabel.setBounds(250,410,200,80);
		AdPaylabel.setFont(new Font("STYLUS", Font.BOLD, 20));

	
		AdPayText = new JTextField();
		AdPayText.setBounds(550,440,165,30);
	
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(40,35,900,590);
		bpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

		
		Mlabel = new JLabel ("Benefits and Deductions");
		Mlabel.setBounds(200,43,600,85);
        Mlabel.setForeground(new Color (0xe3c1fe));
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 45));
		
		Mpanel = new JPanel();
        Mpanel.setBackground(new Color(0x55009b));
									// hexadecimal values for color
		Mpanel.setBounds(40,35,900,110);
		Mpanel.setBorder(BorderFactory.createLineBorder((new Color(0x1f0039)),3));

		CloseButton = new JButton("Done");
		CloseButton.addActionListener(this);
		CloseButton.setBounds(760,520,100,35);
		CloseButton.setFocusable(false);// removes the border of the text on the button
		CloseButton.setFont(new Font("Stylus", Font.PLAIN, 15));
	
	  	backbutton = new JButton("Back");
    	backbutton.addActionListener(this);
    	backbutton.setBounds(160,520,100,35);
    	backbutton.setFocusable(false);// removes the border of the text on the button
    	backbutton.setFont(new Font("Stylus", Font.PLAIN, 15));


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
		f.add(SSSText);
		f.add(SSSLabel);
		f.add(PhilHealthlabel);
		f.add(PhilHealthText);
		f.add(PagIbiglabel);
		f.add(PagIbigText);
		f.add(WTaxlabel);
		f.add(WTaxText);
		f.add(AdPaylabel);
		f.add(AdPayText);
		f.add(backbutton);
		
		f.add(bpanel);
	}


	@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==CloseButton){
        	f.dispose(); // exits the previous frame

		
		
	}
	}
}
