package Fangfa;
/*方法重载*/
public class Demo1122 {
    public static void main(String[] args) {
        System.out.println(time01(1,2));
        System.out.println(time02(0.1,0.2));
        System.out.println(time03(1,2,3));
    }

    public static int time01(int num1,int num2) {
       return num1*num2;
    }
    public static double time02(double num1,double num2) {
        return num1*num2;
    }public static int time03(int num1,int num2,int num3) {
        return num1*num2*num3;
    }
}
