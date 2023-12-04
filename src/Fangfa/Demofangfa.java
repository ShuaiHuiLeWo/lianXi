package Fangfa;

public class Demofangfa {
    public static void main(String[] args) {//String[] args方法参数
        work();
        buy();
        printsum();
        getSum();
        add(1,3);
        get(1.1,1.5);
    }

    public static void work() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void buy() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void printsum() {//无参数无返回值
        int sum=0;
        for (int i=1;i<=5;i++){
            sum+=i;
        }
        System.out.println("1~5之间的输相加等于"+sum);
    }

    public static int getSum() {//无参数有返回值
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1~5之间的输相加等于"+sum);
        return sum;
    }

    public static void add(int num1,int num2) {//有参数无返回值

        System.out.println(num1+num2);
    }

    public static double get(double num1,double num2) {//有参数有返回值
       double sum=0;
        sum=num1+num2;
        System.out.println(sum);
        return sum;
    }

}

