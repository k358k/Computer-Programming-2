import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_AL implements ActionListener{


    private static JFrame f;
    private static JLabel nlabel;
    private static JTextField fullnameText;
    private static JLabel plabel;
    private static JTextField passwordText;
    private static JPanel Mpanel;
    private static JLabel Mlabel;
    private static JPanel bpanel;
    private static JButton button;
    private static JLabel icon;

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //	InfoPage info = new InfoPage(); ** Not Needed ? **

	/*	button = new JButton("LogIn");
		button.addActionListener(new GUI_AL());
		button.setBounds(195,330,100,25);
		button = new JButton("LogIn");
		button.addActionListener(new GUI_AL());
		button.setBounds(195,330,100,25);

		JFrame f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
		f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		f.setResizable(false); // prevent frame from being resized
		f.setSize(500,500); //sets the size of the frame (x and y-dimension of the frame)
		f.setVisible(true); // makes the frame visible****				*/



        // NAME **
        nlabel = new JLabel ("Username :");
        nlabel.setBounds(590,190,140,25);
        nlabel.setFont(new Font ("STYLUS", Font.PLAIN, 20) );


        fullnameText = new JTextField();
        fullnameText.setBounds(730,190,165,25);



        // PASSWORD **
        plabel = new JLabel ("Password :");
        plabel.setBounds(590,230,140,25);
        plabel.setFont(new Font ("STYLUS", Font.PLAIN, 20) );


        passwordText = new JTextField();
        passwordText.setBounds(730,230,165,25);



        //MotorPH sign *
        Mlabel = new JLabel ("Motor PH System");
        Mlabel.setBounds(580,-450,500,1000);
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



        button = new JButton("LogIn");
        button.addActionListener(new GUI_AL());
        button.setBounds(700,330,100,30);
        button.setFocusable(false);// removes the border of the text on the button

        // ** FRAME **
        f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
        f.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
        f.setLayout(null);// allows you to resize the panels? ** CHECK!! **
        f.setResizable(false); // prevent frame from being resized
        f.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)

        //name
        f.add(fullnameText);
        f.add(nlabel);

        //password
        f.add(passwordText);
        f.add(plabel);


        //MotorPH System sign
        f.add(Mlabel);
        f.add(Mpanel);


        // BUTTON **
        f.add(button);



        //background panel
        f.add(bpanel);		//all the element  should be put before this background panel so that they will show at the front of background panel

        icon = new JLabel();
        icon.setBounds(-120,0,700,670);



        ImageIcon image = new ImageIcon("img.png");
        Image img = image.getImage();
        Image imgScale = img.getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(imgScale);

        f.setIconImage(image.getImage()); // this will change the icon on the title bar
        f.getContentPane().setBackground(new Color(0xCCCCFF)); // sets the color of the background
        // red, green, blue


        icon.setIcon(finalImage);



        f.add(icon);

        f.setVisible(true); // makes the frame visible****

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            f.dispose(); // exits the previous frame

           new MainPage(); // open new frame


        }
    }





}