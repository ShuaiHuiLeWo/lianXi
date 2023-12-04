package LianXi;

import java.util.Scanner;

public class LianXi {
    public static void main(String[] args) {
        String[] Names = {"西瓜", "葡萄", "荔枝"};//水果名称
        int[] Prices = {25, 18, 22};//水果价格
        int[] Counts = {80, 66, 78};//水果库存
        while (true) {
            int num = choose();
            switch (num) {
                case 1:
                    show(Names, Prices, Counts);
                    break;
                case 2:
                    XiuGaiCounts(Names, Counts);
                    break;
                case 3:
                    XiuGaiPrices(Names, Prices);
                    break;
                case 4:
                    System.out.println("谢谢您的光临");
                    break;
                default:
                    System.out.println("选择错误，请重新输入");
            }
        }
    }


    public static int choose() {
        System.out.println("————欢迎来到旺旺水果店—————");
        System.out.println("1:查看水果信息");
        System.out.println("2:修改水果价格");
        System.out.println("3:修改水果库存");
        System.out.println("4:退出系统");
        System.out.print("请输入你的操作系统:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static void show(String[] Names, int[] Prices, int[] Counts) {
        System.out.println("--查看水果清单--");
        int NumPrices = 0;//总价格
        int NumCounts = 0;//总库存
        System.out.println("水果名称" + "\t" + "水果价格(元/斤)" + "\t" + "水果库存(斤)");//"\t\t"在此表示空格
        for (int i = 0; i < Names.length; i++) {//把所有水果遍历一遍
            NumCounts += Counts[i];//把所有水果的库存加上算出总库存
            NumPrices += Prices[i] * Counts[i];//把价格和库存相乘计算出总价格
            System.out.println(Names[i] + "\t\t" + Prices[i] + "\t\t\t\t" + Counts[i]);
            //输出"水果名称" + "\t\t" + "水果价格(元/斤)" + "\t\t" + "水果库存(斤)"
        }
        System.out.println("总库存" + NumCounts + "斤\t" + "总价格" + NumPrices + "元");//输出总库存和总价格
    }

    public static void XiuGaiCounts(String[] Names, int[] Counts) {
        System.out.println("请输入要修改库存的名称:");
        Scanner input = new Scanner(System.in);//输入水果名称
        String Name = input.next();
        System.out.println("请输入修改后的库存:");
        int count = input.nextInt();//输入修改库存
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(Name)) {
                Counts[i] = count;
            }
            System.out.println("修改成功!");
        }
    }

    public static void XiuGaiPrices(String[] Names, int[] Prices) {
        System.out.println("请输入要修改价格的名称:");
        Scanner input = new Scanner(System.in);//输入水果名称
        String Name = input.next();
        System.out.println("请输入修改后的价格:");
        int Price = input.nextInt();//输入修改价格
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(Name)) {
                Prices[i] = Price;
            }
            System.out.println("修改成功!");
        }
    }
}
