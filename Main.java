import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.util.ArrayList;  

public class Main  implements ActionListener{
    JFrame f;
    JLabel l1,l2;  
    JButton b;
    JTextField tf;
    JLabel l;
    ArrayList<String> arr;
    Main(){
        arr = new ArrayList<String>();
        f = new JFrame();
        b = new JButton("Add");
        tf= new JTextField();
         
        tf.setBounds(310,60,150,70);
        b.setBounds(50,140,100,40);
        b.addActionListener(this);       

        l1=new JLabel("This is Java Swing Practice.");  
        l1.setBounds(50,50, 300,30);  
        l2=new JLabel("Leave a Message");  
        l2.setBounds(50,100, 300,30);  

        l = new JLabel("");
        l.setBounds(50,190, 300,30);  
        f.add(l1); f.add(l2);
        f.add(l);
 
        f.add(b);
        f.add(tf);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {  
        try{
            String text = tf.getText();
            arr.add(text);
            
            String msg="";

            for (int i = 0; i < arr.size(); i++) {
                msg += (arr.get(i)+System.lineSeparator());

              }
              l.setText("Your Message: "+msg);  
        }catch(Exception ex){System.out.println(ex);}  
    }  


    public static void main(String args[]){ 
        new Main();
    }
}