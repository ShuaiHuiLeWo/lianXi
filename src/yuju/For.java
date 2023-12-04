package yuju;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        for (int count = 0; count < 5; count++) {
            System.out.println("请输入正确密码:");
            password = scanner.nextInt();
            if (password == 5488) {
                System.out.println("密码正确!!!");
                break;
            } else {
                if (count < 5) {
                    System.out.println("密码错误，你还有" + (4 - count) + "次机会");
                }else {
                    System.out.println("密码错误");
                }
            }
        }
        scanner.close();
    }
}
