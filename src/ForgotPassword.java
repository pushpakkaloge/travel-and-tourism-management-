import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.EventListener;

public class ForgotPassword extends JFrame implements ActionListener {
    JButton jButton1,jButton2,jButton3;
    JTextField jTextField2,jTextField3,jTextField4,jTextField5,jTextField6;
    ForgotPassword(){
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(400,150,1000,500);

        //jPanel 1
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(135,206,250));
        jPanel1.setBounds(10,10,690,445);
        jPanel1.setLayout(null);
        add(jPanel1);

        //jLabel 1 Image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = image1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon newImageIcon =  new ImageIcon(i2);
        JLabel jLabel1 = new JLabel(newImageIcon);
        jLabel1.setBounds(743,130,200,200);
        add(jLabel1);

        //jLabel2
        JLabel jLabel2 = new JLabel("Username: ");
        jLabel2.setBounds(50,100,150,40);
        jLabel2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jLabel2);

        //jTextField2
        jTextField2 = new JTextField();
        jTextField2.setBounds(200,105,150,30);
        jTextField2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jTextField2);

        //jButton Search username
        jButton1 = new JButton("Search");
        jButton1.setBounds(360,105,100,30);
        jButton1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        jButton1.setBorder(new LineBorder(new Color(30,144,255)));
        jButton1.addActionListener(this);
        jPanel1.add(jButton1);

        //jLabel3
        JLabel jLabel3 = new JLabel("Name: ");
        jLabel3.setBounds(50,150,150,40);
        jLabel3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jLabel3);

        //jTextField3
        jTextField3 = new JTextField();
        jTextField3.setBounds(200,155,150,30);
        jTextField3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jTextField3);

        //jLabel4
        JLabel jLabel4 = new JLabel("Security question :");
        jLabel4.setBounds(50,200,150,40);
        jLabel4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        jPanel1.add(jLabel4);

        //jTextField4
        jTextField4 = new JTextField();
        jTextField4.setBounds(200,205,250,30);
        jTextField4.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jTextField4);

        //jLabel5
        JLabel jLabel5 = new JLabel("Answer: ");
        jLabel5.setBounds(50,250,150,40);
        jLabel5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jLabel5);

        //jButton Retrieve
        jButton2 = new JButton("Retrieve");
        jButton2.setBounds(360,255,100,30);
        jButton2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        jButton2.setBorder(new LineBorder(new Color(30,144,255)));
        jButton2.addActionListener(this);
        jPanel1.add(jButton2);

        //jTextField5
        jTextField5 = new JTextField();
        jTextField5.setBounds(200,255,150,30);
        jTextField5.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jTextField5);

        //jLabel6
        JLabel jLabel6 = new JLabel("Password: ");
        jLabel6.setBounds(50,300,150,40);
        jLabel6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jLabel6);

        //jTextField6
        jTextField6 = new JTextField();
        jTextField6.setBounds(200,305,150,30);
        jTextField6.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        jPanel1.add(jTextField6);

        //jButton Back
        jButton3 = new JButton("Back");
        jButton3.setBounds(140,380,100,30);
        jButton3.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        jButton3.setBorder(new LineBorder(new Color(30,144,255)));
        jButton3.addActionListener(this);
        jPanel1.add(jButton3);
    }

    public void actionPerformed(ActionEvent e){
        String mUserName = jTextField2.getText();
        String mSecurityAnswer = jTextField5.getText();
        Conn c = new Conn();
        if(e.getSource()==jButton1){
            try {
                String sql = "SELECT * FROM users WHERE username='" + mUserName + "'";
                ResultSet rs = c.s.executeQuery(sql);
                if(rs.next()) {
                        jTextField3.setText(rs.getString("name"));
                        jTextField4.setText(rs.getString("sQuestion"));

                }else{
                    JOptionPane.showMessageDialog(null,"User not found !");
                }
            }catch (Exception ex){
             ex.printStackTrace();
            }
        }else if(e.getSource()==jButton2){
            try {
                String sql = "SELECT * FROM users WHERE username='" + mUserName + "' AND sAnswer='"+mSecurityAnswer+"'";
                ResultSet rs = c.s.executeQuery(sql);
                if(rs.next()){
                    jTextField6.setText(rs.getString("password"));
                }else{
                    JOptionPane.showMessageDialog(null,"Wrong Answer");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }else if(e.getSource()==jButton3){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }

}
