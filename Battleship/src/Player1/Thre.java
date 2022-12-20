
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Thre extends Thread{
    Fonction fonc;
    int[] messag;
    ServerSocket server;
    Socket client;
    Socket cliente;

    public Thre(Fonction fonc,  ServerSocket server, Socket client,int[] messag) {
        this.fonc = fonc;
        this.messag = messag;
        this.server = server;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            InputStream is = client.getInputStream();
            ObjectInputStream message = new ObjectInputStream(is);
            cliente = server.accept();
            OutputStream os = cliente.getOutputStream();
            ObjectOutputStream messa = new ObjectOutputStream(os);

while(true) {

    fonc.setObj((int[]) message.readObject());

    messa.writeObject(this.messag);
    fonc.setObj((int[]) message.readObject());

}

            } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
