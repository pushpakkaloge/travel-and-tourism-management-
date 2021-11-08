import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
    JPanel p1,p2,p3;
    CheckPackage(){
        setBounds(400,100,800,500);
        JTabbedPane pane = new JTabbedPane();

        String[] p1Data = new String[]{"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistant","Half Day city Tour",
                "BBQ Dinner","Welcome Drinks on Arrival","Full Day 3 Island Cruise","English Speaking guide",
                "Book Now","SUMMER SPECIAL","Rs. 19000 /-","icons/package1.jpg"};

        String[] p2Data = new String[]{"SILVER PACKAGE","5 Days and 6 Nights","Airport Assistant","Half Day city Tour",
                "Daily Buffet","Entrance Free tickets","Clubbing And Horse Riding","English Speaking guide",
                "Book Now","WINTER SPECIAL","Rs. 22000 /-","icons/package2.jpg"};

        String[] p3Data = new String[]{"BRONZE PACKAGE","3 Days and 4 Nights","Airport Assistant","Half Day city Tour",
                "Cruise Dinner","Welcome Drinks on Arrival","Night Safari","English Speaking guide",
                "Book Now","WINTER SPECIAL","Rs. 15000 /-","icons/package3.jpg"};

        //panel 1
        p1 = getPackage(p1Data);
        //panel 2
        p2 = getPackage(p2Data);
        //panel 3
        p3 = getPackage(p3Data);

        pane.addTab("Package 1",null,p1);
        pane.addTab("Package 2",null,p2);
        pane.addTab("Package 3",null,p3);
        add(pane); //,BorderLayout.CENTER

    }

    public JPanel getPackage(String[] data){
        JPanel p1 =new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(data[0]);
        l1.setBounds(60,5,200,50);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l1);

        JLabel l2 = new JLabel(data[1]);
        l2.setBounds(10,60,200,50);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);

        JLabel l3 = new JLabel(data[2]);
        l3.setBounds(10,100,200,50);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);

        JLabel l4 = new JLabel(data[3]);
        l4.setBounds(10,140,200,50);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);

        JLabel l5 = new JLabel(data[4]);
        l5.setBounds(10,180,200,50);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);

        JLabel l6 = new JLabel(data[5]);
        l6.setBounds(10,220,250,50);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l6);

        JLabel l7 = new JLabel(data[6]);
        l7.setBounds(10,260,250,50);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l7);

        JLabel l8 = new JLabel(data[7]);
        l8.setBounds(10,300,250,50);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l8);

        JLabel l9 = new JLabel(data[8]);
        l9.setBounds(30,360,200,50);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l9);

        JLabel l10 = new JLabel(data[9]);
        l10.setBounds(240,380,300,50);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l10);

        JLabel l11 = new JLabel(data[10]);
        l11.setBounds(630,380,300,50);
        l11.setForeground(Color.RED);
        l11.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l11);

        //label1 image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource(data[11]));
        Image i1 = image1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon newImageIcon1 = new ImageIcon(i1);
        JLabel label1 = new JLabel(newImageIcon1);
        label1.setBounds(280, 0, 500, 300);
        p1.add(label1);


        return p1;
    }


    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
