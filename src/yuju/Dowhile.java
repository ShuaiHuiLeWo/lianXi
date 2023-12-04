package yuju;

import java.util.Scanner;

/**
 * @Author：AixCert
 * @Date：2023/10/22 22:44
 **/
public class Dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        int count = 0;
        do {
            System.out.println("请输入正确密码:");
            password = scanner.nextInt();
            if (password == 5488) {
                System.out.println("密码正确,欢迎登录！！");
                break;
            } else {
                count++;
                if (count < 5){
                    System.out.println("密码错误，你还有" + (5 - count) + "次机会");
                }else{
                    System.out.println("密码错误,请等待30秒后再尝试");
                }
            }
        } while (count < 5);
//        if (password == 5488) {
//        }else {
//            System.out.println("密码错误,请等待30秒后再尝试");
//        }
        scanner.close();
    }
}