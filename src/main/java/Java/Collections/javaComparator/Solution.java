package Java.Collections.javaComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        if (player1.score > player2.score){
            return -1;
        } else if (player1.score < player2.score) {
            return 1;
        } else {
            return player2.name.compareTo(player1.name);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Solution {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int n = scanner.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scanner.next(), scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(player, checker);
        for (Player aPlayer : player) {
            System.out.printf("%s %s\n", aPlayer.name, aPlayer.score);
        }
    }
}
