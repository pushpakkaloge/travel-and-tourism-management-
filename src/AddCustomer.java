import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {
    JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,jTextField6,jTextField7,
            jTextField8,jTextField9,jTextField10;
    JButton b1,b2;
    JRadioButton r1,r2;
    JComboBox c1;
    String username;

    AddCustomer(String username){
        this.username = username;
        setLayout(null);
        getContentPane().setBackground(Color.white); //new Color(135,206,250)
        setBounds(380,100,900,600);

        //label1 image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i1 = image1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon newImageIcon1 =  new ImageIcon(i1);
        JLabel label1 = new JLabel(newImageIcon1);
        label1.setBounds(450,5,400,500);
        add(label1);

        //label2
        JLabel label2 = new JLabel("Username :");
        label2.setBounds(50,30,150,40);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label2);

        //textfield2
        jTextField2 = new JTextField();
        jTextField2.setBounds(180,38,150,30);
        jTextField2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField2);

        //label3
        JLabel label3 = new JLabel("ID :");
        label3.setBounds(50,80,150,40);
        label3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label3);

        //Drop down menu
        c1 = new JComboBox(new String[]{"Passport","Aadhar card","Pan card","Ration card"});
        c1.setBounds(180,88,150,25);
        add(c1);

        //label4
        JLabel label4 = new JLabel("ID Number :");
        label4.setBounds(50,130,150,40);
        label4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label4);

        //textfield4 id number
        jTextField4 = new JTextField();
        jTextField4.setBounds(180,138,150,30);
        jTextField4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField4);

        //label5 name
        JLabel label5 = new JLabel("Name :");
        label5.setBounds(50,180,150,40);
        label5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label5);

        //textfield5 name
        jTextField5 = new JTextField();
        jTextField5.setBounds(180,188,150,30);
        jTextField5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField5);

        //label6 Gender
        JLabel label6 = new JLabel("Gender :");
        label6.setBounds(50,230,150,40);
        label6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label6);

        //RadioButtons r1
        r1 = new JRadioButton("Male");
        r1.setBounds(180,238,70,30);
        add(r1);


        //RadioButtons r2
        r2 = new JRadioButton("Female");
        r2.setBounds(250,238,80,30);
        add(r2);

        //label7 Country
        JLabel label7 = new JLabel("Country :");
        label7.setBounds(50,280,150,40);
        label7.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label7);

        //textfield7 Country
        jTextField7 = new JTextField();
        jTextField7.setBounds(180,288,150,30);
        jTextField7.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField7);

        //label8 address
        JLabel label8 = new JLabel("Address :");
        label8.setBounds(50,330,150,40);
        label8.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label8);

        //textfield8 Address
        jTextField8 = new JTextField();
        jTextField8.setBounds(180,338,150,30);
        jTextField8.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField8);

        //label9 Phone
        JLabel label9 = new JLabel("Phone :");
        label9.setBounds(50,380,150,40);
        label9.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label9);

        //textfield9 Phone
        jTextField9 = new JTextField();
        jTextField9.setBounds(180,388,150,30);
        jTextField9.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField9);

        //label10 email
        JLabel label10 = new JLabel("Email :");
        label10.setBounds(50,430,150,40);
        label10.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(label10);

        //textfield10 email
        jTextField10 = new JTextField();
        jTextField10.setBounds(180,438,150,30);
        jTextField10.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(jTextField10);

        //JBUtton save
        b1 = new JButton("Save");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.setBounds(70,500,100,30);
        b1.addActionListener(this);
        add(b1);

        //JBUtton Cancel
        b2 = new JButton("Cancel");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.setBounds(210,500,100,30);
        b2.addActionListener(this);
        add(b2);

        if(!username.equals("")){
            try {
                Conn c = new Conn();
                String query = "SELECT * FROM customers WHERE username='" + username + "'";
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    jTextField2.setText(rs.getString("username"));
                    jTextField5.setText(rs.getString("name"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            //define variables
            String mUsername = jTextField2.getText();
            String mId = c1.getSelectedItem().toString();
            String mIdNumber = jTextField4.getText();
            String mName = jTextField5.getText();
            String mGender = "";
            if(r1.isSelected()){
                mGender="male";
            }else if(r2.isSelected()){
                mGender="Female";
            }
            String mCountry = jTextField7.getText();
            String mAddress = jTextField8.getText();
            String mPhone = jTextField9.getText();
            String mEmail = jTextField10.getText();

            //sql query
            String query = "INSERT INTO customers VALUES('"+mUsername+"','"+mId+"','"+mIdNumber+"','"+mName+"','"+mGender+"','"+mCountry+"','"+mAddress+"','"+mPhone+"','"+mEmail+"')";
            try{
                 Conn c =  new Conn();
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Customer Added successfully");
                 this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }


    public static void main(String[] args) {
        new AddCustomer("").setVisible(true);
    }
}
