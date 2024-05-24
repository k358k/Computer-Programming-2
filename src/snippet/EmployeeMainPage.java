package snippet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EmployeeMainPage implements ActionListener{

	private static JFrame f = new JFrame();
    private static JLabel icon;
    private static JPanel Mpanel;
    private static JLabel Mlabel;
    private static JPanel bpanel;
    private static JButton InfoButton;
    private static JButton NetWageButton;
    private static JButton BenefitsDeductionsButton;
    private static JButton GrossWageButton;
    private static JButton RequestMeetingButton;
   
	
	public  EmployeeMainPage(){
		
	    Mlabel = new JLabel ("Main Page");
        Mlabel.setBounds(620,-450,500,1000);
        Mlabel.setForeground(new Color (0xe3c1fe));
        Mlabel.setFont(new Font("broadway", Font.PLAIN, 40));


        Mpanel = new JPanel();
        Mpanel.setBackground(new Color(0x330066));
        // hexadecimal values for color
        Mpanel.setBounds(500,0,500,100);
        //left-right on the frame, up-down on the frame, length of the panel, width of the panel


        // background panel
        bpanel = new JPanel();
        bpanel.setBackground(new Color(0xF0F0F0));
        bpanel.setBounds(500,0,500, 1000);



        InfoButton = new JButton("Employee Informations");
        InfoButton.addActionListener(this);
        InfoButton.setBounds(600,150,280, 45);
        InfoButton.setFocusable(false);// removes the border of the text on the button
        InfoButton.setFont(new Font ("STYLUS", Font.BOLD, 15) );

        
        NetWageButton = new JButton("Net Wage Page");
        NetWageButton.addActionListener(this);
        NetWageButton.setBounds(600,230,280,45);
        NetWageButton.setFocusable(false);// removes the border of the text on the button
        NetWageButton.setFont(new Font ("STYLUS", Font.BOLD, 15) );

    	
        BenefitsDeductionsButton = new JButton("Benefits and Deductions Page");
        BenefitsDeductionsButton.addActionListener(this);
        BenefitsDeductionsButton.setBounds(600,310,280,45);
        BenefitsDeductionsButton.setFocusable(false);// removes the border of the text on the button
        BenefitsDeductionsButton.setFont(new Font ("STYLUS", Font.BOLD, 15) );

    	
        GrossWageButton = new JButton("Gross Wage Page");
        GrossWageButton.addActionListener(this);
        GrossWageButton.setBounds(600,390,280,45);
        GrossWageButton.setFocusable(false);// removes the border of the text on the button
        GrossWageButton.setFont(new Font ("STYLUS", Font.BOLD, 15) );

    	
        RequestMeetingButton = new JButton("Request Meeting");
        RequestMeetingButton.addActionListener(this);
        RequestMeetingButton.setBounds(600,470,280,45);
        RequestMeetingButton.setFocusable(false);// removes the border of the text on the button
        RequestMeetingButton.setFont(new Font ("STYLUS", Font.BOLD, 15) );

    	
        
        
		f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
	    f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
	    f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
	    f.setResizable(false); // prevent frame from being resized
	    f.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)

	    icon = new JLabel();
        icon.setBounds(-120,0,700,670);



        ImageIcon image = new ImageIcon("img.png");
        Image img = image.getImage();
        Image imgScale = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(imgScale);

        f.setIconImage(image.getImage()); // this will change the icon on the title bar
        f.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
        // red, green, blue

        
        f.add(Mlabel);
        f.add(Mpanel);
        f.add(InfoButton);
        f.add(NetWageButton);
        f.add(BenefitsDeductionsButton);
        f.add(GrossWageButton);
        f.add(RequestMeetingButton);
        
        f.add(bpanel);

        icon.setIcon(finalImage);
        f.add(icon);
        f.setVisible(true); // makes the frame visible****

        
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		   if(e.getSource()==InfoButton){
			   f.dispose();
			   new InfoPage();
			   
			   
			
		   		} else if(e.getSource()== NetWageButton) {
		   			f.dispose();			
		   			new NetWagePage();
			
		   			
		   			
		   		} else if(e.getSource()== BenefitsDeductionsButton) {
		   			f.dispose();
		   			new Benefits_DeductionPage();
		   			
		   		} else if(e.getSource()== GrossWageButton) {
		   			f.dispose();
		   			new GrossWagePage();
		   			
		   		} else if (e.getSource()==RequestMeetingButton) {
		   			f.dispose();
		   			new RequestPage();
		   			
		 
		 
}	
	}
	
}
