package yuju;

import java.util.Random;
import java.util.Scanner;

public class ChouJiang {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num > sum) {
                System.out.println("猜大了");
            } else if (num < sum) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜对了");
            }
        }
    }
}
