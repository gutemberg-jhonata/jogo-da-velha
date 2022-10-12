public class JogoDaVelha {
    char[][] grade = new char[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length; j++) {
                grade[i][j] = ' ';
            }
        }

        imprimeGrade();
    }

    public void imprimeGrade() {
        for (int i = 0; i < grade.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < grade.length; j++) {
                char character = grade[i][j];
                System.out.print(character);
                System.out.print(" | ");                
            }
            System.out.println();
        }
    }

    public Boolean jogar(Jogador jogador) {
        int x = jogador.getX();
        int y = jogador.getY();

        char character = grade[x][y];
        if (character == ' ') {
            grade[x][y] = jogador.getSymbol();
        } else {
            System.out.println("Jogada inválida");
        }

        imprimeGrade();

        return verificaVencedor();
    }

    private Boolean verificaVencedor() {
        Boolean hasWinner = horizontalMatch();
        if (!hasWinner) {
            hasWinner = verticalMatch();
        }
        // Houve vencedor na diagonal
        // Deu velha
        return hasWinner;
    }

    private Boolean horizontalMatch() {
        for (int i = 0; i < grade.length; i++) {
            Integer countSymbolMatch = 0;
            char symbol = grade[i][0];

            if (symbol != ' ') {
                for (int j = 1; j < grade.length; j++) {
                    char nextSymbol = grade[i][j];
                    if (symbol == nextSymbol) {
                        countSymbolMatch++;
                    }              
                }
            }
            
            if (countSymbolMatch == grade.length - 1) {
                return true;
            }
        }

        return false;
    }

    private Boolean verticalMatch() {
        for (int i = 0; i < grade.length; i++) {
            Integer countSymbolMatch = 0;
            char symbol = grade[0][i];

            if (symbol != ' ') {
                for (int j = 1; j < grade.length; j++) {
                    char nextSymbol = grade[j][i];
                    if (symbol == nextSymbol) {
                        countSymbolMatch++;
                    }              
                }
            }
            
            if (countSymbolMatch == grade.length - 1) {
                return true;
            }
        }

        return false;
    }
}
