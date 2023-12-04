package LianXi;

import java.util.Scanner;

public class LianXi2 {
    public static void main(String[] args) {
        String[] Names = {" 联想 ", " 惠普 ", "七彩虹"};
        double[] Size = {13.3, 14.3, 15.3};
        int[] Counts = {40, 80, 77};
        int[] Prices = {4399, 4499, 5399};
        while (true) {
            int num = choose();
            switch (num) {
                case 1:
                    show(Names, Prices, Size, Counts);
                    break;
                case 2:
                    SumCounts(Names, Counts);
                    break;
                case 3:
                    System.out.println("感谢你的光临!!!");
                    break;
                default:
                    System.out.println("选择错误,请重新选择");
            }
        }
    }

    public static int choose() {
        System.out.println("---库存管理---");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }

    public static void show(String[] Names, int[] Prices, double[] Size, int[] Counts) {
        System.out.println("查看电脑库存");
        int NumPrices = 0;
        int NumCounts = 0;
        System.out.println("品牌" + "\t\t\t" + "价格" + "\t\t\t" + "尺寸" + "\t\t\t" + "库存");
        for (int i = 0; i < Names.length; i++) {
            NumCounts += Counts[i];
            NumPrices += Prices[i] * Counts[i];
            System.out.println(Names[i] + "\t\t" + Prices[i] + "\t\t" + Size[i] + "\t\t" + Counts[i]);
        }
        System.out.println("总库存" + NumCounts + "总价格" + NumPrices);
    }

    public static void SumCounts(String[] Names, int[] Counts) {
        System.out.println("请输入需要修改的联想库存");
        Scanner se = new Scanner(System.in);
//        String Name = se.next();
        int count = se.nextInt();

        System.out.println("-----------");

        System.out.println("请输入需要修改的惠普库存");
        Scanner se1 = new Scanner(System.in);
//        String Names1 = se1.next();
        int count1 = se1.nextInt();

        System.out.println("-----------");

        System.out.println("请输入需要修改的七彩虹库存");
        Scanner se2 = new Scanner(System.in);
//        String Names2 = se2.next();
        int count2 = se2.nextInt();

        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(count)) {
                Counts[i] = count;
            }
            if (Names[i].equals(count1)) {
                Counts[i] = count1;
            }
            if (Names[i].equals(count2)) {
                Counts[i] = count2;
            }
            System.out.println("修改成功!!!");
        }
    }
}