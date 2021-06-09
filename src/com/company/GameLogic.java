package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLogic {
    private static int remainingMatches = 20;

    public GameLogic() {
    }
    private int playerChoiceNumber() {
        int playerChoiceNumber = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            playerChoiceNumber = scanner.nextInt();
        } catch (InputMismatchException var3) {
            System.out.println("Надо ввести число!!!");
        }
        return playerChoiceNumber;
    }
    private void playerTern() {
        int i = this.playerChoiceNumber();
        if (i > 0 && i < 4) {
            remainingMatches -= i;
        } else {
            (new ConsoleOutput()).wrongNumberPlayer();
            this.playerTern();
        }
    }
    private void computerTern() {
        (new ConsoleOutput()).outputtingComputerRunning(PCLogic.computerRunningLogic(remainingMatches));
        remainingMatches -= PCLogic.computerRunningLogic(remainingMatches);
    }
    public void gameRun() {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.outputtingRulesGame();
        while(remainingMatches >= 5) {
            this.computerTern();
            consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
            consoleOutput.firstPleaseEnterPlayerNumber();
            this.playerTern();
            consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
        }
        this.computerTern();
        consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
        consoleOutput.endGame();
    }
}
