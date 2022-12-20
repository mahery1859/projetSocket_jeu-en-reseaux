
import java.io.IOException;
import java.net.Socket;

public class BattleShip1 {
    int attempts = 1;
    static int[] mitifitra= new int[2];

     int[] val= new int[2];
    static Fonction1 fonc= new Fonction1();

    public BattleShip1() throws Exception {
    }

    public void alefa(int[] shoot) throws IOException {


        Fonction1 fcnt = new Fonction1();
        int[][] board = new int[7][7];		// le plateau de jeu
        int[][] ships = new int[5][2];
        int     					// essaye
                shipTouched;					// bateau touche

        fcnt.initBoard(board);
        fcnt.initShips(ships);

        System.out.println();

  attempts = 1;
            fcnt.showBoard(board);

            mitifitra=fcnt.shoot(shoot);

        val=fonc.commClient(mitifitra);
            if(fcnt.hit(fcnt.getObj(),ships)){
                fcnt.indice(fcnt.getObj(),ships,attempts);

            }
            else
                fcnt.indice(fcnt.getObj(),ships,attempts);

            fcnt.changeboard(fcnt.getObj(),ships,board);

    attempts++;

        //System.out.println("\n\n\nYou Lose the game ");
        //fcnt.showBoard(board);
    }

    public  int[] getMitifitra() {
        return mitifitra;
    }

    public  void setMitifitra(int[] mitifitra) {
        BattleShip1.mitifitra = mitifitra;
    }


}
