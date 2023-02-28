package tictactoe;

class Tictactoe{
    public static void main(String[] args) {
        int playertime = 0;
        Gamesetup gs = new Gamesetup();
        do{
            gs.playgame();
            gs.displayRes();
            gs.verticalcheck();
            gs.horizontalcheck();
            gs.diagonalcheck();
            playertime++;
        }while(playertime!=9);
    }
}