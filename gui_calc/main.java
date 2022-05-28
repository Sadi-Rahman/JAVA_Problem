import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calc extends JFrame implements ActionListener{

    static JFrame f;
    static JTextField l;

    string s0,s1,s2;

    calc()
    {
        s0=s1=s2="";
    }
}

public static void main (String args[]){
    f=new JFrame("Calculator");

    try{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    }
    catch (Exception e){
        System.err.printls(e.getMassage());
    }

    calc c = new calc();
    1=new JTextField(16);
    1.setEditable(false);

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,beq,beq1;
}