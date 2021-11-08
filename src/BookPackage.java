import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Stack;

public class BookPackage extends JFrame implements ActionListener {
    JComboBox c1;
    JTextField t1;
    JButton b1,b2,b3;
    String username;
    JLabel l7,l9,l11,l13;
    int goldPrice=19000;
    int silverPrice =22000;
    int bronzePrice=15000;
    BookPackage(String username){
        this.username = username;
        setLayout(null);
        setBackground(Color.WHITE);
        setBounds(300,100,1000,600);

        //book package label
        JLabel l1 = new JLabel("Book Package");
        l1.setBounds(100,20,200,50);
        l1.setForeground(Color.red);
        l1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
        add(l1);

        //label username
        JLabel l2 = new JLabel("Username :");
        l2.setBounds(60,60,200,100);
        l2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l2);

        //label username
        JLabel l3 = new JLabel("XXXXXXX");
        l3.setBounds(230,60,140,100);
        l3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l3);

        //label select package
        JLabel l4 = new JLabel("Select package :");
        l4.setBounds(60,110,200,100);
        l4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l4);

        //drop down menu Select package
        c1 = new JComboBox(new String[]{"Gold package","Silver package","Bronze package"});
        c1.setBounds(230,153,140,20);
        add(c1);

        //label Total persons
        JLabel l5 = new JLabel("Total persons :");
        l5.setBounds(60,180,200,70);
        l5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l5);

        //textfield total persons
        t1 = new JTextField("1");
        t1.setBounds(230,203,140,30);
        t1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        add(t1);

        //label ID
        JLabel l6 = new JLabel("ID :");
        l6.setBounds(60,230,100,70);
        l6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l6);

        //label ID 2
         l7 = new JLabel("XXXXXX");
        l7.setBounds(230,230,100,70);
        l7.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        add(l7);

        //label Number
        JLabel l8 = new JLabel("ID Number :");
        l8.setBounds(60,280,150,70);
        l8.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l8);

        //label Number
        l9 = new JLabel("XXXXXX");
        l9.setBounds(230,280,140,70);
        l9.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        add(l9);

        //label Phone
        JLabel l10 = new JLabel("Phone :");
        l10.setBounds(60,330,100,70);
        l10.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l10);

        //label Phone
        l11 = new JLabel("XXXXXX");
        l11.setBounds(230,330,120,70);
        l11.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        add(l11);

        //label Total Price
        JLabel l12 = new JLabel("Total price :");
        l12.setBounds(60,380,150,70);
        l12.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l12);

        //label Total Price
        l13 = new JLabel("");
        l13.setBounds(230,380,150,70);
        l13.setForeground(new Color(255, 0, 25));
        l13.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        add(l13);

        //label1 image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i1 = image1.getImage().getScaledInstance(560, 400, Image.SCALE_DEFAULT);
        ImageIcon newImageIcon1 = new ImageIcon(i1);
        JLabel label1 = new JLabel(newImageIcon1);
        label1.setBounds(415, 20, 560, 400);
        add(label1);

        //Button Check Price
        b1 = new JButton("Check price");
        b1.setBounds(80,500,130,25);
        b1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        b1.addActionListener(this);
        add(b1);

        //Button Book Package
        b2 = new JButton("Book Package");
        b2.setBounds(250,500,150,25);
        b2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        b2.setForeground(Color.green);
        b2.addActionListener(this);
        b2.setVisible(false);
        add(b2);

        //Button Back
        b3 = new JButton("Back");
        b3.setBounds(440,500,130,25);
        b3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        b3.setForeground(Color.red);
        b3.addActionListener(this);
        add(b3);

        try{
            String query = "SELECT * FROM bookedpackage WHERE username='" + username + "'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);

            if(!rs.next()){
                b2.setVisible(true);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            String query = "SELECT * FROM customers WHERE username='" + username + "'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                l3.setText(rs.getString("username"));
                l7.setText(rs.getString("id"));
                l9.setText(rs.getString("idnumber"));
                l11.setText(rs.getString("phone"));
//                l13.setText(rs.getString("address"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == b1){
        String selectedPackage = c1.getSelectedItem().toString();
        int totalPersons = Integer.decode(t1.getText());
        int totalPrice=0;

        if(selectedPackage.equals("Gold package")){
            totalPrice = goldPrice*totalPersons;
        }else if(selectedPackage.equals("Silver package")){
            totalPrice = silverPrice*totalPersons;
        }else if(selectedPackage.equals("Bronze package")){
            totalPrice = bronzePrice*totalPersons;
        }else{
            totalPrice = 0;
        }

        l13.setText("Rs. "+Integer.toString(totalPrice));
    }else if(ae.getSource() == b2){
        String muserName = username;
        String mPackage = c1.getSelectedItem().toString();
        String mPersons = t1.getText();
        String mId = l7.getText();
        String mNumber = l9.getText();
        String mPhone = l11.getText();
        String mPrice = l13.getText();
            if(!mPrice.equals("")) {
                String query = "INSERT INTO bookedpackage VALUES('" + muserName + "','" + mPackage + "','" + mPersons + "','" + mId + "','" + mNumber + "','" + mPhone + "','" + mPrice + "')";
                try {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Package Booked successfully");
                    this.setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                ;
            }
    }else if(ae.getSource() == b3){
        this.setVisible(false);
    }
    }

    public static void main(String[] args) {
        new BookPackage("").setVisible(true);
    }
}
