package com.company;

public class ConsoleOutput {
    public ConsoleOutput() {
    }
    public void outputtingRulesGame() {
        System.out.println("В начале игры на столе лежит 20 спичек.\nИгроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.\nПроигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }
    public void displayingTheRemainingNumberOfMatches(int remainingNumberOfMatches) {
        System.out.println("На столе осталось: " + remainingNumberOfMatches + " спичек.");
    }
    public void outputtingComputerRunning(int numberOfMatchesSelectedByTheComputer) {
        System.out.println(" - Количество спичек выбранное компьютером = " + numberOfMatchesSelectedByTheComputer);
    }
    public void firstPleaseEnterPlayerNumber() {
        System.out.println("Ваш ход! Введите число спичек: ");
    }
    public void wrongNumberPlayer() {
        System.out.println("Некорректное значение. Введите число от 1 до 3.");
    }

    public void endGame() {
        System.out.println("Вы взяли последнюю спичку :( Вы проиграли!");
    }
}