package snakeladder;

import java.util.Random;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDERMOVE = 1;
    static final int SNAKEMOVE = 2;
    static final int WIN_POSITION = 100;

    int position = 0;
    int diceCount = 0;
    Random random = new Random();

    int rollDice() {
        diceCount++;
        return random.nextInt(6) + 1;
    }

    int getOption() {
        return random.nextInt(3);
    }

    void playGame() {
        while (position != WIN_POSITION) {
            int dice = rollDice();
            int option = getOption();

            int previousPosition = position;

            switch (option) {
                case SNAKEMOVE -> {
                    position -= dice;
                }
                case LADDERMOVE -> {
                    position += dice;
                }
                default -> {
                }
            }

            if (position < 0)
                position = 0;

            if (position > WIN_POSITION)
                position = previousPosition;

            System.out.println("Dice: " + dice + " Position: " + position);
        }

        System.out.println("Game won after rolling dice " + diceCount + " times");
    }
}
