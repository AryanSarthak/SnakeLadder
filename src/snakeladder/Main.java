package snakeladder;

import static snakeladder.SnakeAndLadder.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        Player player1 = new Player(0);
        Player player2 = new Player(0);
        SnakeAndLadder game = new SnakeAndLadder();

        while (true) {
            System.out.println("Player 1 Turn");
            while (game.playTurn(player1)) {
                if (player1.getPosition() == WIN_POSITION) {
                    System.out.println("Player 1 wins!");
                    System.out.println("Dice rolled: " + diceCount);
                    return;
                }
            }

            if (player1.getPosition() == WIN_POSITION) {
                System.out.println("Player 1 wins!");
                break;
            }

            System.out.println("Player 2 Turn");
            while (game.playTurn(player2)) {
                if (player2.getPosition() == WIN_POSITION) {
                    System.out.println("Player 2 wins!");
                    System.out.println("Dice rolled: " + diceCount);
                    return;
                }
            }

            if (player2.getPosition() == WIN_POSITION) {
                System.out.println("Player 2 wins!");
                break;
            }
        }

        System.out.println("Dice rolled: " + diceCount);
    }
}