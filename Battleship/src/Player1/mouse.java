
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.*;

public class mouse implements MouseListener{
Fra f;
j1Frame koto;

    public mouse(Fra fr) {
        this.f = fr;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        f.setVisible(false);
        try {
            koto = new j1Frame();
            koto.interf();
        }
        catch(Exception ec){}
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
