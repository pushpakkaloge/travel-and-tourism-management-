import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Home extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username="";
    Home(String username){
        this.username = username;
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
       // setBounds(250,5,1100,700);

        //jpanel1 top
        JPanel panel1  = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,139,139));
        panel1.setBounds(0,0,1950,60);
        add(panel1);

        //label1 image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i1 = image1.getImage().getScaledInstance(100,60,Image.SCALE_DEFAULT);
        ImageIcon newImageIcon1 =  new ImageIcon(i1);
        JLabel label1 = new JLabel(newImageIcon1);
        label1.setBounds(30,0,100,60);
        panel1.add(label1);

        //label3 Dashboard name
        JLabel label3 = new JLabel("Dashboard");
        label3.setFont(new Font("Tahoma",Font.BOLD,30));
        label3.setForeground(Color.white);
        label3.setBounds(150,0,200,60);
        panel1.add(label3);

        //jpanel2 left
        JPanel panel2  = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(0,139,139));
        panel2.setBounds(0,60,240,1000);
        add(panel2);

        //button add personal Details
        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(32,178,170));
        b1.setForeground(Color.white);
        b1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b1.setBounds(10,10,220,30);
        b1.setMargin(new Insets(0,0,0,30));
        b1.addActionListener(this);
        panel2.add(b1);

        //button Update personal Details
        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(32,178,170));
        b2.setForeground(Color.white);
        b2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b2.setBounds(10,50,220,30);
        b2.setMargin(new Insets(0,0,0,5));
        b2.addActionListener(this);
        panel2.add(b2);

        //button View Details
        b3 = new JButton("View Details");
        b3.setBackground(new Color(32,178,170));
        b3.setForeground(Color.white);
        b3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b3.setBounds(10,90,220,30);
        b3.setMargin(new Insets(0,0,0,90));
        b3.addActionListener(this);
        panel2.add(b3);

        //button Delete personal Details
        b4 = new JButton("Delete Personal Details");
        b4.setBackground(new Color(32,178,170));
        b4.setForeground(Color.white);
        b4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b4.setBounds(10,130,220,30);
        b4.setMargin(new Insets(0,0,0,7));
        b4.addActionListener(this);
        panel2.add(b4);

        //button Check Package
        b5 = new JButton("Check Package");
        b5.setBackground(new Color(32,178,170));
        b5.setForeground(Color.white);
        b5.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b5.setBounds(10,170,220,30);
        b5.setMargin(new Insets(0,0,0,65));
        b5.addActionListener(this);
        panel2.add(b5);

        //button Book Package
        b6 = new JButton("Book Package");
        b6.setBackground(new Color(32,178,170));
        b6.setForeground(Color.white);
        b6.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b6.setBounds(10,210,220,30);
        b6.setMargin(new Insets(0,0,0,72));
        b6.addActionListener(this);
        panel2.add(b6);

        //button View Package
         b7 = new JButton("View Package");
        b7.setBackground(new Color(32,178,170));
        b7.setForeground(Color.white);
        b7.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b7.setBounds(10,250,220,30);
        b7.setMargin(new Insets(0,0,0,72));
        b7.addActionListener(this);
        panel2.add(b7);

        //button View Hotels
         b8 = new JButton("View Hotels");
        b8.setBackground(new Color(32,178,170));
        b8.setForeground(Color.white);
        b8.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b8.setBounds(10,290,220,30);
        b8.setMargin(new Insets(0,0,0,86));
        b8.addActionListener(this);
        panel2.add(b8);

        //button Book Hotel
         b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(32,178,170));
        b9.setForeground(Color.white);
        b9.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b9.setBounds(10,330,220,30);
        b9.setMargin(new Insets(0,0,0,92));
        b9.addActionListener(this);
        panel2.add(b9);

        //button View Booked Hotel
         b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(32,178,170));
        b10.setForeground(Color.white);
        b10.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b10.setBounds(10,370,220,30);
        b10.setMargin(new Insets(0,0,0,35));
        b10.addActionListener(this);
        panel2.add(b10);

        //button Destinations
         b11 = new JButton("Destinations");
        b11.setBackground(new Color(32,178,170));
        b11.setForeground(Color.white);
        b11.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b11.setBounds(10,410,220,30);
        b11.setMargin(new Insets(0,0,0,80));
        b11.addActionListener(this);
        panel2.add(b11);

        //button Payment
         b12 = new JButton("Payment");
        b12.setBackground(new Color(32,178,170));
        b12.setForeground(Color.white);
        b12.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b12.setBounds(10,450,220,30);
        b12.setMargin(new Insets(0,0,0,105));
        b12.addActionListener(this);
        panel2.add(b12);

        //button Calculator
        b13 = new JButton("Calculator");
        b13.setBackground(new Color(32,178,170));
        b13.setForeground(Color.white);
        b13.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b13.setBounds(10,490,220,30);
        b13.setMargin(new Insets(0,0,0,90));
        b13.addActionListener(this);
        panel2.add(b13);

        //button Notepad
        b14 = new JButton("Notepad");
        b14.setBackground(new Color(32,178,170));
        b14.setForeground(Color.white);
        b14.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b14.setBounds(10,530,220,30);
        b14.setMargin(new Insets(0,0,0,105));
        b14.addActionListener(this);
        panel2.add(b14);

        //button Notepad
        b15 = new JButton("About");
        b15.setBackground(new Color(32,178,170));
        b15.setForeground(Color.white);
        b15.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        b15.setBounds(10,570,220,30);
        b15.setMargin(new Insets(0,0,0,120));
        b15.addActionListener(this);
        panel2.add(b15);

        //label2 image
        ImageIcon image2 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = image2.getImage().getScaledInstance(1500,750,Image.SCALE_DEFAULT);
        ImageIcon newImageIcon2 =  new ImageIcon(i2);
        JLabel label2 = new JLabel(newImageIcon2);
        label2.setBounds(100,60,1500,750);
        add(label2);

        //label4 Dashboard Travel and Tourism Management
        JLabel label4 = new JLabel("Travel and Tourism Management System");
        label4.setFont(new Font("Tahoma",Font.PLAIN,40));
        label4.setForeground(Color.white);
        label4.setBounds(450,30,800,60);
        label2.add(label4);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true);
        }else if(ae.getSource() == b2){
            new UpdateCustomer(username).setVisible(true);
        }else if(ae.getSource()==b4){
            new DeleteCustomer(username).setVisible(true);
        }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
            new viewPackage(username).setVisible(true);
        }else if(ae.getSource()==b8){
                new Checkhotels().setVisible(true);
        }else if(ae.getSource()==b9){
                new BookHotel(username).setVisible(true);
        }else if(ae.getSource()==b10){
                new ViewHotel(username).setVisible(true);
        }else if(ae.getSource()==b11){
                new Destinations().setVisible(true);
        }else if(ae.getSource()==b12){
                new Payment().setVisible(true);
        }else if(ae.getSource()== b13){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch (Exception e){
                    e.printStackTrace();
                }
        }else if(ae.getSource()==b3){
          new ViewCustomer(username).setVisible(true);

        } else if(ae.getSource() == b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()== b15){
            new About().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
}
