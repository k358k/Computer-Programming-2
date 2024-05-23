import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AccountsPage extends JFrame {
        JPanel panel;
        JButton button;
        DefaultTableModel tableModel;
        JTable table;
        JButton viewbutton;
        JButton updatebutton;
        JButton deletebutton;
        JLabel employeelistlabel;

    AccountsPage(){
        employeelistlabel = new JLabel("MotorPH Employee List");
        employeelistlabel.setBounds(10,30,400,30);
        employeelistlabel.setFont(new Font("Arial Bold",Font.BOLD,30));
        employeelistlabel.setForeground(Color.WHITE);


        deletebutton = new JButton("Delete");
        deletebutton.setBounds(15,120,120,30);
        deletebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        deletebutton.setBackground(new Color(51,102,153));
        deletebutton.setFont(new Font(null,Font.BOLD,13));
        deletebutton.setForeground(Color.WHITE);

        updatebutton = new JButton("Update");
        updatebutton.setBounds(15,70,120,30);
        updatebutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        updatebutton.setBackground(new Color(51,102,153));
        updatebutton.setFont(new Font(null,Font.BOLD,13));
        updatebutton.setForeground(Color.WHITE);

        viewbutton = new JButton("View Employee");
        viewbutton.setBounds(15,20,120,30);
        viewbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        viewbutton.setBackground(new Color(51,102,153));
        viewbutton.setFont(new Font(null,Font.BOLD,13));
        viewbutton.setForeground(Color.WHITE);



        panel = new JPanel();
        panel.setBounds(620,100,150,350);
        panel.add(viewbutton);
        panel.add(updatebutton);
        panel.add(deletebutton);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        panel.setBackground(Color.WHITE);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Employee #");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("First Name");
        tableModel.addColumn("SSS");
        tableModel.addColumn("PhilHealth");
        tableModel.addColumn("TIN");
        tableModel.addColumn("Pagibig");

        table = new JTable(tableModel);


        

//        for (int i = 0; i <25 ; i++) {
//            tableModel.addRow(new String[]{"10001","Sanor", "Kurt Kelly","123","123","123","123"});
//        }



        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10,100,600,350);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Employee Information");
        setLayout(null);
        setSize(800,500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(85,85,85));
        add(scrollPane);
        add(panel);
        add(employeelistlabel);
        setVisible(true);

    }
}