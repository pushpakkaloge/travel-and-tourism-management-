import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable{
    Thread t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    JLabel caption;
    public void run(){
        String[] hotelNames = new String[]{"JW Marriott Hotel","Mandarin Oriental Hotel","Four Seasons Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breeze Blows Hotel","Quick Stop Hotel","Happy Mornings Hotel","Moss View Hotel"};

        try{
            for(int i=0;i<9;++i){
                this.label[i].setVisible(true);
//                caption.setText(hotelNames[i]);
//                this.label[i].add(caption);
                Thread.sleep(1000);
                this.label[i].setVisible(false);
            }
        }catch (Exception e){

        }
    }

    Destinations(){
        setLayout(null);
        setBackground(Color.WHITE);
        setBounds(400,140,900,600);
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null,
                i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
        ImageIcon[] images1 = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        ImageIcon[] images2 = new ImageIcon[]{i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};

        caption = new JLabel();
        caption.setBounds(50,450,400,50);
        caption.setForeground(Color.white);
        caption.setFont(new Font("Tahoma",Font.PLAIN,30));

        for(int i=0;i<=9;++i){
            images1[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
            Image i22 = images1[i].getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
            images2[i] = new ImageIcon(i22);
            label[i] = new JLabel(images2[i]);
            label[i].setBounds(0,0,900,600);
            add(label[i]);
        }
        t1 = new Thread(this);
        t1.start();

    }

    public static void main(String[] args) {
        new Destinations().setVisible(true);
    }
}
