import javax.swing.*;  

public class Main{
    JFrame f;
    Main(){
        f = new JFrame();
        JButton b = new JButton("Click Here");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        b.setBounds(130,100,100,40);
 
        f.add(b);
        f.add(tf);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

        
    }
    public static void main(String args[]){
        // System.out.println("Hi");
        new Main();
    }
}