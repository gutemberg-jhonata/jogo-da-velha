import java.util.Scanner;

public class Jogador {
    private int id;
    private char symbol;
    private int x;
    private int y;

    public Jogador(int id, char symbol) {
        this.id = id;
        this.symbol = symbol;
    }
    
    public int getId() {
        return id;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public void setX(Scanner scanner) {
        System.out.print("Jogador " + id + " - X: ");
        x = scanner.nextInt();
    }

    public int getY() {
        return y;
    }

    public void setY(Scanner scanner) {
        System.out.print("Jogador " + id + " - Y: ");
        y = scanner.nextInt();
    }
}
