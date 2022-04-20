package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
    public static Peca board[][];

    Tabuleiro(char board[][]){

        this.board = new Peca[7][7];

        for (int i = 0; i < 7; i++) // Tabuleiro de 7 por 7
            for (int j = 0; j < 7; j++)
                this.board[i][j] = new Peca(i, j, board[i][j]);
            
    }

    public static void capturaPeca(Coordenada ini, Coordenada fim){
            if (fim.linha == ini.linha){ // mesma linha
                int coluna_medio = (ini.coluna + fim.coluna) / 2;

                board[ini.linha][coluna_medio].mudarStatus();

            } else if (fim.coluna == ini.coluna) { // mesma coluna
                int linha_medio = (ini.linha + fim.linha) / 2;

                board[linha_medio][ini.coluna].mudarStatus();

            }

    }

    public static void mover(Coordenada ini, Coordenada fim){ // move uma peca
            Peca dummy;

            capturaPeca(ini, fim);

            dummy = board[fim.linha][fim.coluna];

            board[ini.linha][ini.coluna].moverPeca(fim);

            board[fim.linha][fim.coluna] = board[ini.linha][ini.coluna];

            board[ini.linha][ini.coluna] = dummy;

    }


}

