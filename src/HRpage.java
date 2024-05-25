
	
	import javax.swing.*;
	import javax.swing.table.DefaultTableModel;

import snippet.EmployeeMainPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class HRpage implements ActionListener{
			JPanel panel;
	        JButton button;
	        DefaultTableModel tableModel;
	        JTable table;
	        JButton viewbutton;
	        JButton updatebutton;
	        JButton deletebutton;
	        JButton backbutton;
	        JLabel employeelistlabel;
	        private static JFrame f = new JFrame();

	    HRpage(){

	    	
	        deletebutton = new JButton("Delete");
	        deletebutton.setBounds(785,200,120,30);
	      //  deletebutton.addActionListener(this);

	        deletebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
	        deletebutton.setBackground(new Color(51,102,153));
	        deletebutton.setFont(new Font(null,Font.BOLD,13));
	        deletebutton.setFocusable(false);// removes the border of the text on the button
	        deletebutton.setForeground(Color.WHITE);

	        updatebutton = new JButton("Update");
	        updatebutton.setBounds(785,280,120,30);
	      //  updatebutton.addActionListener(this);

	        updatebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
	        updatebutton.setBackground(new Color(51,102,153));
	        updatebutton.setFont(new Font(null,Font.BOLD,13));
	        updatebutton.setFocusable(false);// removes the border of the text on the button
	        updatebutton.setForeground(Color.WHITE);

	        viewbutton = new JButton("View Employee");
	        viewbutton.setBounds(785,360,120,30);
	      //  viewbutton.addActionListener(this);

	        viewbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
	        viewbutton.setBackground(new Color(51,102,153));
	        viewbutton.setFont(new Font(null,Font.BOLD,13));
	        viewbutton.setFocusable(false);// removes the border of the text on the button
	        viewbutton.setForeground(Color.WHITE);

	        backbutton = new JButton("Back");
	        backbutton.setBounds(785,440,120,30);
	        backbutton.addActionListener(this);  // Register the back button 
	        
	        backbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
	        backbutton.setBackground(new Color(51,102,153));
	        backbutton.setFont(new Font(null,Font.BOLD,13));
	        backbutton.setFocusable(false);// removes the border of the text on the button
	        backbutton.setForeground(Color.WHITE);

	        
	        
	        
	        employeelistlabel = new JLabel("MotorPH Employee List");
	        employeelistlabel.setBounds(210,35,530,40);
	        employeelistlabel.setFont(new Font("broadway",Font.BOLD,40));
	        employeelistlabel.setForeground(new Color (0xe3c1fe));


	        panel = new JPanel();
	        panel.setBounds(765,100,160,510);
	        panel.setLayout(null);
	        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
	        panel.setBackground(new Color (0xFFFFFF));

	        tableModel = new DefaultTableModel();
	        tableModel.addColumn("Employee #");
	        tableModel.addColumn("Last Name");
	        tableModel.addColumn("First Name");
	        tableModel.addColumn("SSS");
	        tableModel.addColumn("PhilHealth");
	        tableModel.addColumn("TIN");
	        tableModel.addColumn("Pagibig");
	        
	        //(new Color(0x6A6767));

	        
	        table = new JTable(tableModel);
	        
	        //table frame(sizes)
	        JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(30,100,720,510);
	        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));


	        

//	        for (int i = 0; i <25 ; i++) {
//	            tableModel.addRow(new String[]{"10001","Sanor", "Kurt Kelly","123","123","123","123"});
//	        }


	    	f = new JFrame(); // the code "JFrame null = new JFrame" creates a frame
			f.setTitle("Employee Information"); // sets the tile of the frame (the title bar)
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application (makes the frame closed totally and not just hide)
			f.setLayout(null);// allows you to resize the panels? ** CHECK!! **

			
			f.setResizable(false); // prevent frame from being resized
			f.setSize(1000,700); //sets the size of the frame (x and y-dimension of the frame)
			f.setVisible(true); // makes the frame visible****
		

	   
	      
	        f.getContentPane().setBackground(new Color(0x55009b));
	        f.add(scrollPane);

	        f.add(viewbutton);
	        f.add(updatebutton);
	        f.add(deletebutton);
	        f.add(backbutton);
	        
	        f.add(panel);
	        f.add(employeelistlabel);
	 
	    
	
	    }
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub			*/
			
			if(e.getSource() ==backbutton);
			 f.setVisible(false);  // Close the current frame
			 MainPage MainP = new MainPage();
			 MainP.showWindow();
			 
		
					
				}
	}
	
