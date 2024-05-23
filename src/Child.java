import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Child extends JFrame implements ActionListener {

	
	
	JButton button;
	
	Child(){
		
		JButton button = new JButton();
		button.setBounds(190,330,100,40);
		button.addActionListener(this);
		
		
		
		this.setTitle("MotorPH System"); // sets the tile of the frame (the title bar)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
		this.setLayout(null);// allows you to resize the panels? ** CHECK!! **
		this.setResizable(false); // prevent frame from being resized
		this.setSize(500,500); //sets the size of frame (x and y-dimension of the frame)
		this.setVisible(true); // makes the frame visible****
		this.add(button);
		
		
		ImageIcon image = new ImageIcon("image.jpg");
		this.setIconImage(image.getImage()); // this will change the icon on the title bar
		this.getContentPane().setBackground(new Color(120,50,250)); // sets the color of the background
		
		
		
		
		
	}
	
	@Override
	public void ActionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Enter");
			
		}
		
	}
	
}
