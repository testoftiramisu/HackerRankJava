package Algorithms.Implementation.LisasWorkbook;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int chapters = scanner.nextInt();
        int tasksPerPage = scanner.nextInt();
        int pages = 0;
        int specialTasks = 0;

        for (int chapter = 1; chapter <= chapters; chapter++) {
            int tasks = scanner.nextInt();
            int pagesInChapter = 1;
            pages++;

            for (int i = 1; i <= tasks; i++) {
                if (i == pages) {
                    specialTasks++;
                }
                if (i == tasksPerPage * pagesInChapter && i < tasks){
                    pages++;
                    pagesInChapter++;
                }
            }
        }

        System.out.println(specialTasks);
    }
}
