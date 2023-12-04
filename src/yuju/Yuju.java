package yuju;

import java.util.Scanner;

public class Yuju {//if....else if 多分支语句
    public static void main(String[] args) {
        System.out.println("欢迎光临，请问有多少人用餐？");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println("回答：" + count + "人");
        if (count <= 4) {
            System.out.println("客人请到大厅4人桌用餐");
        } else if (count <= 8) {
            System.out.println("客人请到大厅8人桌用餐");
        } else if (count > 8 && count <= 16) {
            System.out.println("客人请到楼上包厢用餐");
        } else {
            System.out.println("抱歉我们可能没有那么大的桌子");
        }
    }
}
