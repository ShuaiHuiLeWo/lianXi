import java.util.Scanner;

public class Main {//Main类
    static String S1 = "你好";//成员变量

    public static void main(String[] args)//main方法里的是局部变量
    {
        String s2 = "java"; //String用于字符串
        System.out.println(S1);
        System.out.println(s2);
        //public 权限修饰符， static 静态修饰符， void 返回值修饰符 void表示没有返回值
        //String[] args 字符串类型的数组，是main方法的参数
        /*访问修饰符：
        public：可以被任何类访问。
        protected：只能被同一包内的类和该类的子类访问。
        default（即默认修饰符）：只能被同一包内的类访问。
        private：只能被本类访问。*/


        /*非访问修饰符：
        static：表示静态变量或方法，可以通过类名直接调用，不需要实例化对象。
        final：表示常量，一旦赋值后就不能再修改。
        abstract：表示抽象类或抽象方法，只有声明，没有具体的实现。
        synchronized：表示同步方法或同步块，在多线程环境下保证线程安全。
        transient：表示瞬时变量，不会被序列化。
        volatile：表示易变变量，在多线程环境下保证可见性和原子性*/
        System.out.println(15 + 20);
        char c1 = '\\';
        char char1 = '\u2605';
        System.out.println(c1);
        System.out.println(char1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");

        int a = 5;
        int b = 10;
        if (a != b) {
            System.out.println("a不等于b");
        } else {
            System.out.println("a等于b");
        }
    }

}
