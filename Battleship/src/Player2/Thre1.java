
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Thre1 extends Thread{
    Fonction1 fonc;
    int[] mess;
    Socket client;

    public Thre1(Fonction1 fonc,Socket client, int[] messag) {
        this.fonc = fonc;
        this.mess = messag;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            OutputStream os = client.getOutputStream();
            ObjectOutputStream message = new ObjectOutputStream(os);
            InputStream iso =  client.getInputStream();
            ObjectInputStream messi = new ObjectInputStream(iso);

            message.writeObject(this.mess);
            if ((int[]) messi.readObject()!= null){
                fonc.setObj((int[]) messi.readObject());
            }else

            fonc.setObj((int[]) messi.readObject());
            message.writeObject(this.mess);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Thre1(Fonction1 fonct, int[] mess) {
        fonc = fonct;
        this.mess = mess;
    }
}

