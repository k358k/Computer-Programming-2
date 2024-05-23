import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoPage implements ActionListener{

	JFrame frame = new JFrame();
	JPanel bpanel;
	JPanel Mpanel;
	JLabel Mlabel;
	JLabel IDLabel;
	JTextField IDText;
	JLabel dlabel;
	JTextField dText;
	JLabel hlabel;
	JTextField hText;
	JLabel lvlabel;
	JTextField lvText;
	JLabel ablabel;
	JTextField abText;
	JButton buttonIP;
	JComboBox<String> DaysWorked;
	JComboBox<String> HoursWorked;
	JComboBox<String> Leave;
	JComboBox<String> Absent;
	
	InfoPage(){ 
		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(50,40,380,390);

		Mlabel = new JLabel ("Employee Info");
		Mlabel.setBounds(110,40,320,55);
		Mlabel.setForeground(new Color (0x99FFFF));  
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 35));
		
		Mpanel = new JPanel();
		Mpanel.setBackground(new Color(0x330066));
									// hexadecimal values for color
		Mpanel.setBounds(50,20,380,90);
		
		
		IDText = new JTextField();
		IDText.setBounds(205,150,165,25);
	
		IDLabel = new JLabel ("Employee ID :");
		IDLabel.setBounds(110,150,80,25);
	
		dlabel = new JLabel ("Days Worked :");
		dlabel.setBounds(110,190,90,25);
	
/*		dText = new JTextField();
		dText.setBounds(205,190,165,25);		*/
		
		hlabel = new JLabel ("Hours Worked :");
		hlabel.setBounds(110,230,90,25);
	
/*		hText = new JTextField();
		hText.setBounds(205,230,165,25);				*/
		
		lvlabel = new JLabel ("Leave :");
		lvlabel.setBounds(110,271,85,25);
	
/*		lvText = new JTextField();
		lvText.setBounds(205,271,165,25);			*/
	
		ablabel = new JLabel ("Absent :");
		ablabel.setBounds(110,311,85,25);
	
/*		abText = new JTextField();
		abText.setBounds(205,311,165,25);			*/
	
		buttonIP = new JButton("Next");
		buttonIP.addActionListener(this);
		buttonIP.setBounds(270,380,100,25);
		buttonIP.setFocusable(false);// removes the border of the text on the button
	
		String[] Daysworked = {"     ","1", "2", "3", "4", "5", "6", "7"}	;
		JComboBox DaysWorked =new JComboBox(Daysworked);
		DaysWorked.setBounds(205,190,165,25);

		String[] Hoursworked = {"     ","3", "4", "5", "6", "7", "8", "9", "10"}	;
		JComboBox HoursWorked =new JComboBox(Hoursworked);
		HoursWorked.setBounds(205,230,165,25);
		
		
		String[] leave = {"     ", "1", "2","3", "4", "5", "6", "7"}	;
		JComboBox Leave =new JComboBox(leave);
		Leave.setBounds(205,271,165,25);

		String[] absent = {"     ", "1", "2", "3", "4", "5"}	;
		JComboBox Absent =new JComboBox(absent);
		Absent.setBounds(205,311,165,25);

		
		
		
		frame.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		frame.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)
		frame.setVisible(true); // makes the frame visible****
		frame.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
		frame.add(Mlabel);

		frame.add(Mpanel);
		frame.add(IDLabel);
		frame.add(IDText);
		frame.add(dlabel);
		frame.add(DaysWorked);
		frame.add(hlabel);
		frame.add(HoursWorked);
		frame.add(lvlabel);
		frame.add(Leave);
		frame.add(ablabel);
		frame.add(Absent);
		frame.add(buttonIP);
		
		
		
		frame.add(bpanel);

		//frame.add(IDLabel);
		//frame.add(IDText);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==buttonIP) { //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
			NetWagePage NetWage = new NetWagePage(); // ** this is calling out the InfoPage class   **
 
		
	} 
		
	}
	
	
}
