package yuju;

import java.util.Scanner;

public class Dowhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        int shu = 0;
        do {
            System.out.println("请输入正确密码:\n");
            password = scanner.nextInt();
            if (password == 5488) {
                System.out.println("密码正确,欢迎登录！！");
                break;
            } else {
                System.out.println("密码错误，你还有" + (4 - shu) + "次机会");
                shu++;
            }
        } while (password != 5488&&(shu < 5));
        if (password == 5488) {
        }else {
            System.out.println("密码错误,请等待30秒后再尝试");
        }
        scanner.close();
    }
}
