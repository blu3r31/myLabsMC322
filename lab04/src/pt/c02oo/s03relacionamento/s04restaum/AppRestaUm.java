package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
      String commands[] = tk.retrieveCommands();

      char board[][] = {
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
         {'P', 'P', 'P', '-', 'P', 'P', 'P'},
         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '}
      };

      Tabuleiro tabuleiro = new Tabuleiro(board);

      tk.writeBoard("Tabuleiro inicial", tabuleiro.board);
      
      for (int l = 0; l < commands.length; l++){
          
        CSVReader input = new CSVReader(commands[l]); 

        tabuleiro.mover(input.ini, input.fim);

        String[] pos_str = commands[l].split(":", 2);
                                                
        tk.writeBoard("source: " + pos_str[0] + "; target: " + pos_str[1], tabuleiro.board);
    
     }
      
      tk.stop();
   }

}
