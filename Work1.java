import java.util.Scanner;


public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入查询的分数：");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("分数输入不正确，请重新输入！");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 60 && score <= 79) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
        scanner.close();

    }
}
