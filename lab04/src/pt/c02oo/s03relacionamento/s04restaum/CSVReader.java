package pt.c02oo.s03relacionamento.s04restaum;

public class CSVReader {
    Coordenada ini, fim;
    
    public Coordenada obtemPosicao(String pos){
        int linha, coluna;

        coluna = Character.getNumericValue(pos.charAt(0)) - 10; // 0 a 6

        linha = Character.getNumericValue(pos.charAt(1)) - 1;  // 0 a 6

        Coordenada ponto = new Coordenada(linha, coluna);

        return ponto;
        
    }

    CSVReader(String command){
        String[] pos = command.split(":", 2);
            
        this.ini = obtemPosicao(pos[0]);

        this.fim = obtemPosicao(pos[1]);
   }
}

