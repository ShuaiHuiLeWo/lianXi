package yuju;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("请输入分数:");
        Scanner scan = new Scanner(System.in);
        int fen = scan.nextInt();
        if (fen >= 90) {
            System.out.println("优秀");
        } else if (fen >= 80) {
            System.out.println("良好");
        } else if (fen >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格！！！");
        }
    }
}
