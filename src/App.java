import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        JogoDaVelha jogo = new JogoDaVelha();
        Jogador jogador1 = new Jogador(1, 'X');
        Jogador jogador2 = new Jogador(2, 'O');
        Boolean hasWinner = false;

        while(!hasWinner) {
            jogador1.setX(scanner);
            jogador1.setY(scanner);
            hasWinner = jogo.jogar(jogador1);

            if (!hasWinner) {
                jogador2.setX(scanner);
                jogador2.setY(scanner);
                hasWinner = jogo.jogar(jogador2);
            }
        }

        scanner.close();
    }
}
