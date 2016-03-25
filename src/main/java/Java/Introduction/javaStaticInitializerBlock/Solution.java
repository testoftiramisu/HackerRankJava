package Java.Introduction.javaStaticInitializerBlock;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean flag = true;
    private static int B, H;

    static {
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || B > 100 || H <= 0 || H > 100) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
