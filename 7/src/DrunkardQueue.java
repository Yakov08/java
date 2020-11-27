package ru.mirea.ikbo2019.Samsonov.pr7.DrunkardQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class DrunkardQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pullFirst, pullSecond;
        do {
            System.out.println("Введите 5 карт разного номинала для игрока 1:");
            pullFirst = scanner.nextLine().split(" ");
            System.out.println("Введите 5 карт разного номинала для игрока 2:");
            pullSecond = scanner.nextLine().split(" ");
        } while (!isCorrect(pullFirst, pullSecond));

        Queue<Integer> playerFirst = parseToInteger(pullFirst);
        Queue<Integer> playerSecond = parseToInteger(pullSecond);

        play(playerFirst, playerSecond);

    }

    public static void play(Queue<Integer> playerFirst, Queue<Integer> playerSecond) {
        int part = 0;
        while (!playerFirst.isEmpty() && !playerSecond.isEmpty() && part < 107) {
            int cardFirst = playerFirst.remove();
            int cardSecond = playerSecond.remove();

            if (cardFirst == 0 && cardSecond == 9) {
                playerFirst.add(cardFirst);
                playerFirst.add(cardSecond);
            } else if (cardFirst == 9 && cardSecond == 0) {
                playerSecond.add(cardFirst);
                playerSecond.add(cardSecond);
            } else if (cardFirst > cardSecond) {
                playerFirst.add(cardFirst);
                playerFirst.add(cardSecond);
            } else {
                playerSecond.add(cardFirst);
                playerSecond.add(cardSecond);
            }
            part++;
        }

        if (part == 107) {
            System.out.println("botva");
        } else if (playerSecond.isEmpty()) {
            System.out.println("first " + part);
        } else {
            System.out.println("second " + part);
        }
    }

    public static Queue<Integer> parseToInteger(String[] pull) {
        Queue<Integer> player = new LinkedList();
        for (String s : pull) {
            player.add(Integer.parseInt(s));
        }
        return player;
    }

    public static boolean isCorrect(String[] pullFirst, String[] pullSecond) {
        String[] check = new String[10];
        System.arraycopy(pullFirst, 0, check, 0, 5);
        System.arraycopy(pullSecond, 0, check, 5, 5);
        Arrays.sort(check);
        for (int i = 0; i < 10; i++) {
            if (i != Integer.parseInt(check[i])) {
                System.out.println("Все карты должны быть без повторений!");
                return false;
            }
        }
        return true;
    }
}