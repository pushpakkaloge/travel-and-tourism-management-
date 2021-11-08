import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {
    JComboBox c2,c3;
    Choice c1;
    JTextField t1,t2;
    JButton b1,b2,b3;
    String username;
    JLabel l7,l9,l11,l12,l14,l16,l13,l18;
    BookHotel( String username){
        this.username = username;
        setLayout(null);
        setBackground(Color.WHITE);
        setBounds(300,100,1000,600);

        //book package label
        JLabel l1 = new JLabel("Book Hotel");
        l1.setBounds(100,20,200,50);
        l1.setForeground(Color.red);
        l1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
        add(l1);

        //label username
        JLabel l2 = new JLabel("Username :");
        l2.setBounds(60,50,150,100);
        l2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l2);

        //label username
        JLabel l3 = new JLabel("XXXXXX");
        l3.setBounds(230,72,140,60);
        l3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l3);

        //label select package
        JLabel l4 = new JLabel("Select Hotel :");
        l4.setBounds(60,90,150,100);
        l4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l4);

        //drop down menu Select package
        c1 = new Choice();
        try{
            String sql = "SELECT * FROM hotels";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(sql);
            while (rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
//    JW Marriott Hotel","Mandarin Oriental Hotel","Four Seasons Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breeze Blows Hotel","Quick Stop Hotel","Happy Mornings Hotel","Moss View Hotel"});
        c1.setBounds(230,133,160,20);
        add(c1);

        //label Total persons
        JLabel l5 = new JLabel("Total persons :");
        l5.setBounds(60,140,200,70);
        l5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l5);

        //textfield total persons
        t1 = new JTextField("1");
        t1.setBounds(230,167,160,23);
        t1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        add(t1);

        //label ID
        JLabel l6 = new JLabel("No. of Days :");
        l6.setBounds(60,180,150,70);
        l6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l6);

        //textfield No. of Days
        t2 = new JTextField("1");
        t2.setBounds(230,207,160,23);
        t2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        add(t2);


        //label Number
        JLabel l8 = new JLabel("AC/non AC :");
        l8.setBounds(60,220,150,70);
        l8.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l8);

        //drop down menu AC/non AC
        c2 = new JComboBox(new String[]{"Yes","No"});
        c2.setBounds(230,248,160,20);
        add(c2);



        //label food included
        JLabel l10 = new JLabel("Food included :");
        l10.setBounds(60,260,150,70);
        l10.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l10);

        //drop down menu Food included
        c3 = new JComboBox(new String[]{"Yes","No"});
        c3.setBounds(230,290,160,20);
        add(c3);

        //label Id
        JLabel l11 = new JLabel("Id :");
        l11.setBounds(60,290,200,100);
        l11.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l11);

        //label Id
         l12 = new JLabel("XXXXXX");
        l12.setBounds(230,290,150,100);
        l12.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l12);

        //label Id Number
        JLabel l13 = new JLabel("Id Number :");
        l13.setBounds(60,332,200,100);
        l13.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l13);

        //label Id Number
         l14 = new JLabel("XXXXXX");
        l14.setBounds(230,332,150,100);
        l14.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l14);

        //label Id Phone
        JLabel l15 = new JLabel("Phone :");
        l15.setBounds(60,372,200,100);
        l15.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l15);

        //label Id Phone
         l16 = new JLabel("XXXXXX");
        l16.setBounds(230,372,150,100);
        l16.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l16);

        //label Id Price
        JLabel l17 = new JLabel("Total Price :");
        l17.setBounds(60,412,200,100);
        l17.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l17);

        //label Id Price
       l18 = new JLabel("");
        l18.setBounds(230,412,150,100);
        l18.setForeground(Color.RED);
        l18.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,17));
        add(l18);



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
        b2 = new JButton("Book Hotel");
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
            String query = "SELECT * FROM bookedhotel WHERE username='" + username + "'";
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
                l12.setText(rs.getString("id"));
                l14.setText(rs.getString("idnumber"));
                l16.setText(rs.getString("phone"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            int cost_per_day=0;
            int food_charges=0;
            int ac_charges=0;
            int total_persons = Integer.decode(t1.getText());
            int no_days = Integer.decode(t2.getText());
            int total_cost=0;
            String is_food =c2.getSelectedItem().toString();
            String is_ac = c3.getSelectedItem().toString();

            try{
                Conn c = new Conn();
                String sql = "SELECT * FROM hotels WHERE name ='"+c1.getSelectedItem()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                    cost_per_day = rs.getInt("cost_per_day");
                    food_charges = rs.getInt("food_charges");
                    ac_charges = rs.getInt("ac_charges");
                }
            }catch (Exception e){

            }

            total_cost = no_days*(cost_per_day*total_persons);
            if(is_food.equals("Yes")){
                total_cost+=food_charges;
            }if(is_ac.equals("Yes")){
                total_cost+=ac_charges;
            }
            l18.setText("Rs. "+total_cost);

        }else if(ae.getSource() == b2){
            String muserName = username;
            String mHotel = c1.getSelectedItem().toString();
            String mPersons = t1.getText();
            String mDays = t2.getText();
            String mAc = c2.getSelectedItem().toString();
            String mFood = c3.getSelectedItem().toString();
            String mId = l12.getText();
            String mNumber = l14.getText();
            String mPhone = l16.getText();
            String mPrice = l18.getText();
            if(!mPrice.equals("")) {
                String query = "INSERT INTO bookedhotel VALUES('" + muserName + "','" + mHotel + "','" + mPersons + "','" + mDays + "','" + mAc + "','" + mFood + "','" + mId + "','" + mNumber + "','" + mPhone + "','" + mPrice + "')";
                try {
                    Conn c = new Conn();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Hotel Booked successfully");
                    this.setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                };
            }

        }else if(ae.getSource() == b3){
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookHotel("").setVisible(true);
    }
}
