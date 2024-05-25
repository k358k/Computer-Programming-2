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


public class InfoPage implements ActionListener{

	private static	JFrame f = new JFrame();
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
	JButton CloseButton;
	JButton backbutton;
	JComboBox<String> DaysWorked;
	JComboBox<String> HoursWorked;
	JComboBox<String> Leave;
	JComboBox<String> Absent;
	
	InfoPage(){ 
		
		bpanel = new JPanel();
		bpanel.setBackground(new Color(0xF0F0F0));
		bpanel.setBounds(40,35,900,590);
		bpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

		
		Mlabel = new JLabel ("Employee Info");
		Mlabel.setBounds(300,43,600,85);
        Mlabel.setForeground(new Color (0xe3c1fe));
		Mlabel.setFont(new Font("BROADWAY", Font.PLAIN, 55));
		
		Mpanel = new JPanel();
        Mpanel.setBackground(new Color(0x55009b));
									// hexadecimal values for color
		Mpanel.setBounds(40,35,900,110);
		Mpanel.setBorder(BorderFactory.createLineBorder((new Color(0x1f0039)),3));

		

		
		IDLabel = new JLabel ("Employee ID :");
		IDLabel.setBounds(250,170,200,80);
		IDLabel.setFont(new Font("STYLUS", Font.BOLD, 22));
	
	
	
		dlabel = new JLabel ("Days Worked :");
		dlabel.setBounds(250,230,200,80);
		dlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

/*		dText = new JTextField();
		dText.setBounds(205,190,165,25);		*/
		
		hlabel = new JLabel ("Hours Worked :");
		hlabel.setBounds(250,290,200,80);
		hlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

/*		hText = new JTextField();
		hText.setBounds(205,230,165,25);				*/
		
		lvlabel = new JLabel ("Leave :");
		lvlabel.setBounds(250,350,200,80);
		lvlabel.setFont(new Font("STYLUS", Font.BOLD, 22));

/*		lvText = new JTextField();
		lvText.setBounds(205,271,165,25);			*/
	
		ablabel = new JLabel ("Absent :");
		ablabel.setBounds(250,410,200,80);
		ablabel.setFont(new Font("STYLUS", Font.BOLD, 22));

/*		abText = new JTextField();
		abText.setBounds(205,311,165,25);			*/
	
		
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

        
        
		IDText = new JTextField();
		IDText.setBounds(550,200,165,25);
	
		
		String[] Daysworked = {"     ","1 day", "2 days", "3 days", "4 days", "5 days", "6 days", "7 days"}	;
		JComboBox DaysWorked =new JComboBox(Daysworked);
		DaysWorked.setBounds(550,260,165,25);

		String[] Hoursworked = {"     ","3hrs", "4hrs", "5hrs", "6hrs", "7hrs", "8hrs", "9hrs", "10hrs"}	;
		JComboBox HoursWorked =new JComboBox(Hoursworked);
		HoursWorked.setBounds(550,320,165,25);
		
		
		String[] leave = {"     ", "1 day", "2 days","3 days", "4 days", "5 days", "6 days", "7 days"}	;
		JComboBox Leave =new JComboBox(leave);
		Leave.setBounds(550,380,165,25);

		String[] absent = {"     ", "1 day", "2 days", "3 days", "4 days", "5 days"}	;
		JComboBox Absent =new JComboBox(absent);
		Absent.setBounds(550,440,165,25);

		
		ImageIcon image = new ImageIcon("img.png");// create the image icon
		
		f.setTitle("MotorPH System"); // sets the tile of the f (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the f closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		f.setResizable(false); // prevent f from being resized
		f.setSize(1000,700); //sets the size of the f (x and y-dimension of the f)
		f.setVisible(true); // makes the f visible****
		f.getContentPane().setBackground(new Color(0xf2e2fe)); // sets the color of the background
	
		f.setIconImage(image.getImage()); // this will set/change the image icon on the title f
		
		f.add(Mlabel);
		f.add(Mpanel);
		f.add(IDLabel);
		f.add(IDText);
		f.add(dlabel);
		f.add(DaysWorked);
		f.add(hlabel);
		f.add(HoursWorked);
		f.add(lvlabel);
		f.add(Leave);
		f.add(ablabel);
		f.add(Absent);
		f.add(CloseButton);
		f.add(backbutton);		
		
		
		f.add(bpanel);

		//f.add(IDLabel);
		//f.add(IDText);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==CloseButton) { //**** NEEDED TO GET TO THE NEXT PAGE WHEN BUTTON IS CLICKED *****
			f.dispose();
 
		
		} else if(e.getSource()== backbutton) {
			f.setVisible(false);
			EmployeeMainPage EmployeeMP = new EmployeeMainPage();
			EmployeeMP.showWindow();
		

		
	}
	}
	
}
