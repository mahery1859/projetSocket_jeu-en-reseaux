
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.*;

public class mouses implements MouseListener{
Fram f;
j2Frame koto;

    public mouses(Fram fr) {
        this.f = fr;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        f.setVisible(false);
        try {
            koto = new j2Frame();
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
