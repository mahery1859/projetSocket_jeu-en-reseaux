
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Fra extends JFrame {

    public Fra() throws Exception{
        mouse list = new mouse(this);
        JPanel pan = new JPanel();
        JButton but = new JButton();
        but.setBounds(200,400,20,20);
        but.addMouseListener(list);
        but.setText("j1.Jouer");
        pan.add(but);
        this.add(pan);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        new Fra();
    }


}

/*

*/

