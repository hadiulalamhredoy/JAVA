package javaswing;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPasswordField;
public class PasswordField extends JFrame{
private Container c;
private JPasswordField pf;
PasswordField()
{
initComponents();
}
public void initComponents()
{
c = this.getContentPane();
c.setLayout(null);
c.setBackground(Color.BLUE);
pf = new JPasswordField();
pf.setEchoChar('*');
pf.setBounds(50,20,150,50);
c.add(pf);
}
public static void main(String[] args) {
PasswordField frame = new PasswordField();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setBounds(200,50,400,300);
frame.setTitle("JTextField");
}
}
