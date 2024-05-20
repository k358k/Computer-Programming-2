import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RequestPage {
	
	JFrame frame = new JFrame(); 
	JPanel bpanel;
	JLabel Mlabel;
	JPanel Mpanel;
	JButton Dbutton;
	JLabel tlabel;
	JTextField tText;
	JLabel dlabel;
	JTextField dText;
	JLabel reasonlabel;
	JTextField reasonText;
	JComboBox<String> Date;
	JComboBox<String> Time;
	JComboBox<String> Reason;


	RequestPage(){
		
		
		dlabel = new JLabel ("Date :");
		dlabel.setBounds(120,190,80,25);
		
	
	/*	dText = new JTextField();
		dText.setBounds(190,190,165,25);		*/
		
		
		
		// PASSWORD **
		tlabel = new JLabel ("Time :");
		tlabel.setBounds(120,230,80,25);
		
	
/*		tText = new JTextField();
		tText.setBounds(190,230,165,25);		*/
	
		
		
		// ROLE **
		reasonlabel = new JLabel ("Reason : ");
		reasonlabel.setBounds(120,270,80,25);
		// *** JLabel is for the permanent words on the frame ***
		
	
/*		reasonText = new JTextField();
		reasonText.setBounds(190,270,165,25);	*/
		
		
		String[] date = {" ", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}	;
		JComboBox Date =new JComboBox(date);
		Date.setBounds(190,190,165,25);

		String[] time = {" ","12:00pm", "1:00pm", "2:00pm", "3:00pm", "4:00pm", "5:00pm", "6:00pm", "7:00pm"}	;
		JComboBox Time =new JComboBox(time);
		Time.setBounds(190,230,165,25);

		String[] reason = {"     ","Salary", "Absent", "Leave", "Hours Worked", "Days Worked", "Deductions", "Employee Info"}	;
		JComboBox Reason =new JComboBox(reason);
		Reason.setBounds(190,270,165,25);

		
		
		Dbutton = new JButton("Done");
		Dbutton.addActionListener(new Benefits_DeductionPage());
		Dbutton.setBounds(270,380,100,25);
		Dbutton.setFocusable(false);// removes the border of the text on the button

		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(50,40,380,390);

		Mlabel = new JLabel ("Schedule Meeting");
		Mlabel.setBounds(95,40,320,55);
		Mlabel.setForeground(new Color (0x99FFFF));  
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 32));
		
		Mpanel = new JPanel();
		Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
		Mpanel.setBounds(50,20,380,90);
	
		frame.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		frame.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
		frame.setVisible(true); // makes the frame visible****
		frame.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
		
		frame.add(tlabel);
		frame.add(Date);
		frame.add(Time);
		frame.add(dlabel);
		frame.add(reasonlabel);
		frame.add(Reason);
		frame.add(Dbutton);
		frame.add(Mlabel);
		frame.add(Mpanel);
		frame.add(bpanel);
		
	}

}
