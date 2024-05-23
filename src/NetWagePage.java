import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NetWagePage implements ActionListener{
	
	JFrame frame = new JFrame(); 
	
	
	JLabel Mlabel;
	JPanel Mpanel;
	JPanel bpanel;
	JButton buttonNW;
	JLabel NWLabel;
	JTextField NWText;
	
	
	NetWagePage(){
		
		NWLabel = new JLabel ("Net Wage :");
		NWLabel.setBounds(110,150,120,25);
		NWLabel.setFont(new Font("SLAB SERIF", Font.BOLD, 15));

		NWText = new JTextField();
		NWText.setBounds(175,180,165,25);
	
		
		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(50,40,380,390);

		Mlabel = new JLabel ("Net Wage Page");
		Mlabel.setBounds(105,40,320,55);
		Mlabel.setForeground(new Color (0x99FFFF));  
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 35));
		
		Mpanel = new JPanel();
		Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
		Mpanel.setBounds(50,20,380,90);

		
		buttonNW = new JButton("Next");
		buttonNW.addActionListener(this);
		buttonNW.setBounds(270,380,100,25);
		buttonNW.setFocusable(false);// removes the border of the text on the button
    
		
		frame.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		frame.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
		frame.setVisible(true); // makes the frame visible****
		frame.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
		frame.add(Mlabel);
		frame.add(Mpanel);
		frame.add(buttonNW);
		frame.add(NWLabel);
		frame.add(NWText);
		
		frame.add(bpanel);

		
	}
	public void actionPerformed(ActionEvent e) {
		

		//	if(e.getSource()==buttonNW) { //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
		Benefits_DeductionPage Deductions = new Benefits_DeductionPage(); // ** this is calling out the InfoPage class   **
		frame.dispose();

		
	}

}
