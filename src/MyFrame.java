import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

	MyFrame(){
		
		this.setTitle("MotorPH App");// sets the title of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
	  	this.setSize(420,420); // sets the x and y dimension of the this
		this.setResizable(false);// prevent the this from being resize
		this.setVisible(true);// makes the this visible
		
		
		ImageIcon pic = new ImageIcon("image.png");// create an ImageIcon
		this.setIconImage(pic.getImage());// change icon of the this
		this.getContentPane().setBackground(new Color(123,50,250));// change the color of the background
													//(red, green, blue)
	
		
	
	}
	}

