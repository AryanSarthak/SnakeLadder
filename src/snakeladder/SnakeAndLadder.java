package snakeladder;

import java.util.Random;

public class SnakeAndLadder {
    static final int LADDERMOVE = 1;
    static final int SNAKEMOVE = 2;
    static final int WIN_POSITION = 100;

    static int diceCount = 0;
    Random random = new Random();

    int rollDice() {
        diceCount++;
        return random.nextInt(6) + 1;
    }

    int getOption() {
        return random.nextInt(3);
    }

    public  boolean playTurn(Player player) {
        int dice = rollDice();
        int option = getOption();
        int previousPosition = player.getPosition();

        if (option == LADDERMOVE)  player.setPosition(previousPosition+ dice);
        else if (option == SNAKEMOVE) player.setPosition(previousPosition- dice);

        if (player.getPosition() < 0) player.setPosition(0);

        if (player.getPosition() > WIN_POSITION) player.setPosition(previousPosition);

        System.out.println("Dice: " + dice + " Position: " + player.getPosition());

        return option == LADDERMOVE;
    }
}
