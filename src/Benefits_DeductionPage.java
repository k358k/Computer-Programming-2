import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Benefits_DeductionPage implements ActionListener{
	
	JFrame frame = new JFrame(); 
	JPanel bpanel;
	JLabel Mlabel;
	JPanel Mpanel;
	JButton BDbutton;
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
		SSSLabel.setBounds(100,150,100,25);
	
		SSSText = new JTextField();
		SSSText.setBounds(230,150,145,25);
	
		PhilHealthlabel = new JLabel ("PhilHealth :");
		PhilHealthlabel.setBounds(100,190,100,25);
	
		PhilHealthText = new JTextField();
		PhilHealthText.setBounds(230,190,145,25);
		
		PagIbiglabel = new JLabel ("Pag - Ibig :");
		PagIbiglabel.setBounds(100,230,100,25);
	
		PagIbigText = new JTextField();
		PagIbigText.setBounds(230,230,145,25);	
		
		WTaxlabel = new JLabel ("Withholding Tax :");
		WTaxlabel.setBounds(100,271,100,25);
	
		WTaxText = new JTextField();
		WTaxText.setBounds(230,271,145,25);
	
		AdPaylabel = new JLabel ("Advance Payment :");
		AdPaylabel.setBounds(100,311,110,25);
	
		AdPayText = new JTextField();
		AdPayText.setBounds(230,311,145,25);
	
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(50,40,380,390);

		Mlabel = new JLabel ("Deductions");
		Mlabel.setBounds(135,40,320,55);
		Mlabel.setForeground(new Color (0x99FFFF));  
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 35));
		
		Mpanel = new JPanel();
		Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
		Mpanel.setBounds(50,20,380,90);
	
		BDbutton = new JButton("Next");
		BDbutton.addActionListener(this);
		BDbutton.setBounds(270,380,100,25);
		BDbutton.setFocusable(false);// removes the border of the text on the button

		
		
		frame.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		frame.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
		frame.setVisible(true); // makes the frame visible****
		frame.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background

		frame.add(Mlabel);
		frame.add(Mpanel);
		frame.add(BDbutton);
		frame.add(SSSText);
		frame.add(SSSLabel);
		frame.add(PhilHealthlabel);
		frame.add(PhilHealthText);
		frame.add(PagIbiglabel);
		frame.add(PagIbigText);
		frame.add(WTaxlabel);
		frame.add(WTaxText);
		frame.add(AdPaylabel);
		frame.add(AdPayText);
		
		
		frame.add(bpanel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			

		//	if(e.getSource()==buttonNW) { //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
		GrossWagePage GrossWage = new GrossWagePage(); // ** this is calling out the InfoPage class   **
		frame.dispose();

		
		
	}

}
