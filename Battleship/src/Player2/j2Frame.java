import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class j2Frame extends JFrame {
    static j2Panel[] pan;
    Socket cliente;

    public void checkConnexion() throws Exception{

        Socket client = new Socket("localhost",9124);
        this.cliente = client;
    }
    public void interf() throws Exception {
        System.out.println("Connecting to Serveur...");
        checkConnexion();
        JFrame f = new JFrame();
        GridLayout layout = new GridLayout(7,7);
        Border bor  = new LineBorder(Color.BLACK);
        pan = new j2Panel[49];

        f.setLayout(layout);
        int x = 1;
        int y =1;
        for (int i =0;i< 49;i++) {
            pan[i] = new j2Panel();
            pan[i].setIndice(i);
            pan[i].setXpos(x);
            pan[i].setYpos(y);
            if(x == 7){
                x=0;
                y = y + 1;
            }
            x++;
            pan[i].setBackground(Color.red);
            pan[i].setBorder(bor);
            pan[i].addMouseListener(new j2mouseListner(this));
            f.add(pan[i]);
        }
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public j2Panel[] getPan() {
        return pan;
    }

    public void setPan(j2Panel[] pant) {
       pan = pant;
    }

    public Socket getClients() {
        return cliente;
    }

    public void setClients(Socket clients) {
        this.cliente = clients;
    }
}

/*

 */


