package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {

    Coordenada posicao;
    char status;

    Peca(int linha, int coluna, char status){

        this.status = status;
        this.posicao = new Coordenada(linha, coluna);
    }
    
    public void mudarStatus(){

        if (status == 'P')
            status = '-';
        else
            status = 'P';
    }

    public void moverPeca(Coordenada fim){

        posicao.linha = fim.linha;
        posicao.coluna = fim.coluna;
    }

}

