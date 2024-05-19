import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;

public class Payroll extends JFrame {

    JPanel panel;
    JComboBox chooseMonth;
    String [] months = {"January","February","March","April","May",
            "June","July","August","September","October","November","December"};
    JLabel selectMonth;
    JButton computeButton;
    JTextField nameTextfield;
    JLabel namelabel;
    JTextField IDTextfield;
    JLabel IDlabel;
    JPanel separatorpanel;
    JLabel hoursworkedText;
    JLabel hourlyrateText;
    JLabel SSStext;
    JLabel PhilhealthText;
    JLabel PagibigText;
    JLabel WitholdingtaxText;
    JLabel totaldeductionsText;
    JLabel netsalaryText;

    Payroll(){
        netsalaryText = new JLabel("Net Salary:");
        netsalaryText.setBounds(330,210,200,30);
        netsalaryText.setFont(new Font("Consolas",Font.BOLD,14));

        totaldeductionsText = new JLabel("Total Deductions:");
        totaldeductionsText.setBounds(330,180,200,30);
        totaldeductionsText.setFont(new Font("Consolas",Font.BOLD,14));

        hoursworkedText = new JLabel("Total work hours:");
        hoursworkedText.setBounds(330,60,140,30);
        hoursworkedText.setFont(new Font("Consolas",Font.BOLD,14));

        hourlyrateText = new JLabel("Hourly Rate:");
        hourlyrateText.setBounds(330,80,100,30);
        hourlyrateText.setFont(new Font("Consolas",Font.BOLD,14));

        SSStext = new JLabel("SSS Deductions:");
        SSStext.setBounds(330,100,200,30);
        SSStext.setFont(new Font("Consolas",Font.BOLD,14));

        PhilhealthText = new JLabel("Philhealth Deductions:");
        PhilhealthText.setBounds(330,120,200,30);
        PhilhealthText.setFont(new Font("Consolas",Font.BOLD,14));

        PagibigText = new JLabel("Pagibig Deductions:");
        PagibigText.setBounds(330,140,200,30);
        PagibigText.setFont(new Font("Consolas",Font.BOLD,14));


        WitholdingtaxText = new JLabel("Witholding Tax:");
        WitholdingtaxText.setBounds(330,160,200,30);
        WitholdingtaxText.setFont(new Font("Consolas",Font.BOLD,14));


        separatorpanel = new JPanel();
        separatorpanel.setBackground(Color.BLACK);
        separatorpanel.setBounds(300,0,10,500);

        IDlabel = new JLabel("ID #:");
        IDlabel.setBounds(50,80,150,20);

        IDTextfield = new JTextField();
        IDTextfield.setBounds(50,100,150,20);
        IDTextfield.setBackground(Color.WHITE);
        IDTextfield.setEditable(false);
        IDTextfield.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        namelabel = new JLabel("NAME:");
        namelabel.setBounds(50,40,150,20);

        nameTextfield = new JTextField();
        nameTextfield.setBounds(50,60,150,20);
        nameTextfield.setBackground(Color.WHITE);
        nameTextfield.setEditable(false);
        nameTextfield.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        computeButton = new JButton("COMPUTE");
        computeButton.setBounds(50,200,150,30);
        computeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        computeButton.setBackground(new Color(51,102,153));
        computeButton.setFont(new Font(null,Font.BOLD,13));
        computeButton.setForeground(Color.WHITE);
        computeButton.setFocusable(false);

        selectMonth = new JLabel("Select month to calculate:");
        selectMonth.setBounds(50,140,170,20);

        chooseMonth = new JComboBox(months);
        chooseMonth.setBounds(50,160,150,25);

        panel = new JPanel();
        panel.setBounds(90,50,600,350);
        panel.setLayout(null);
        panel.add(chooseMonth);
        panel.add(selectMonth);
        panel.add(computeButton);
        panel.add(nameTextfield);
        panel.add(namelabel);
        panel.add(IDTextfield);
        panel.add(IDlabel);
        panel.add(separatorpanel);
        panel.add(hoursworkedText);
        panel.add(hourlyrateText);
        panel.add(SSStext);
        panel.add(PhilhealthText);
        panel.add(PagibigText);
        panel.add(WitholdingtaxText);
        panel.add(totaldeductionsText);
        panel.add(netsalaryText);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        add(panel);
        getContentPane().setBackground(new Color(85,85,85));

        setVisible(true);
    }

    public static void main(String[] args) {
        new Payroll();
    }
}
