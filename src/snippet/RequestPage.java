package snippet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RequestPage implements ActionListener{
	
	private static JFrame f = new JFrame(); 
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
	JButton backbutton;
	JComboBox<String> Date;
	JComboBox<String> Time;
	JComboBox<String> Reason;


	RequestPage(){
		
		
		dlabel = new JLabel ("Date :");
		dlabel.setBounds(250,170,200,80);
		dlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

	
	/*	dText = new JTextField();
		dText.setBounds(190,190,165,25);		*/
		
		
		
		// PASSWORD **
		tlabel = new JLabel ("Time :");
		tlabel.setBounds(250,230,200,80);
		tlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

	
/*		tText = new JTextField();
		tText.setBounds(190,230,165,25);		*/
	
		
		
		// ROLE **
		reasonlabel = new JLabel ("Reason : ");
		reasonlabel.setBounds(250,290,200,80);
		// *** JLabel is for the permanent words on the f ***
		reasonlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

	
/*		reasonText = new JTextField();
		reasonText.setBounds(190,270,165,25);	*/
		
		
		String[] date = {" ", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}	;
		JComboBox Date = new JComboBox(date);
		Date.setBounds(550,200,165,25);

		String[] time = {" ","12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm"}	;
		JComboBox Time = new JComboBox(time);
		Time.setBounds(550,260,165,25);

		String[] reason = {"     ","Salary", "Absent", "Leave", "Hours Worked", "Days Worked", "Deductions", "Employee Info"}	;
		JComboBox Reason = new JComboBox(reason);
		Reason.setBounds(550,320,165,25);

		
		
		Dbutton = new JButton("Done");
		Dbutton.addActionListener(new GrossWagePage());
		Dbutton.setBounds(760,520,100,35);
		Dbutton.setFocusable(false);// removes the border of the text on the button
		Dbutton.setFont(new Font("Stylus", Font.PLAIN, 15));
		
		
	  	backbutton = new JButton("Back");
    	backbutton.addActionListener(this);
    	backbutton.setBounds(160,520,100,35);
    	backbutton.setFocusable(false);// removes the border of the text on the button
    	backbutton.setFont(new Font("Stylus", Font.PLAIN, 15));

		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(40,35,900,590);
		bpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

		
		Mlabel = new JLabel ("Request Page");
		Mlabel.setBounds(300,43,600,85);
        Mlabel.setForeground(new Color (0xe3c1fe));
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 55));
		
		Mpanel = new JPanel();
        Mpanel.setBackground(new Color(0x55009b));
									// hexadecimal values for color
		Mpanel.setBounds(40,35,900,110);
		Mpanel.setBorder(BorderFactory.createLineBorder((new Color(0x1f0039)),3));

	
		ImageIcon image = new ImageIcon("img.png");// create the image icon

	
		f.setTitle("MotorPH System"); // sets the tile of the f (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the f closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		f.setResizable(false); // prevent f from being resized
		f.setSize(1000,700); //sets the size of the f (x and y-dimension of the f)
		f.setVisible(true); // makes the f visible****
		f.getContentPane().setBackground(new Color(0xf2e2fe)); // sets the color of the background
		
		f.setIconImage(image.getImage()); // this will set/change the image icon on the title frame

		
		f.add(tlabel);
		f.add(Date);
		f.add(Time);
		f.add(dlabel);
		f.add(reasonlabel);
		f.add(Reason);
		f.add(Dbutton);
		f.add(backbutton);
		f.add(Mlabel);
		f.add(Mpanel);
		f.add(bpanel);
		

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==Dbutton){
		// TODO Auto-generated method stub
		
	}

}}
