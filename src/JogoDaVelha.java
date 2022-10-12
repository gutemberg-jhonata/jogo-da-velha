public class JogoDaVelha {
    char[][] grade = new char[3][3];

    public JogoDaVelha() {
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length; j++) {
                grade[i][j] = ' ';
            }
        }
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

    public void jogar(Jogador jogador) {
        int x = jogador.getX();
        int y = jogador.getY();

        char character = grade[x][y];
        if (character == ' ') {
            grade[x][y] = jogador.getSymbol();
        } else {
            System.out.println("Jogada inválida");
        }
    }
}
