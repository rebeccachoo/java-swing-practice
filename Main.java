import javax.swing.*;  

public class Main{
    JFrame f;
    Main(){
        f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130,100,100,40);
        f.add(b);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        // System.out.println("Hi");
        new Main();
    }
}