import java.util.Arrays;

public class Shuzu {
    public static void main(String[] args) {
      int arr2[][]={{4,3},{1,2}};
        System.out.print("数组中的元素是：");
        int i=0;
        for (int x[]:arr2){
            i++;
            int j=0;
            for (int e : x){
                j++;
                if (i==arr2.length && j==x.length ){
                    System.out.print(e);
                }else {
                    System.out.print(e+"、");
                }
                }
            }
        System.out.print("\n");
        int arr[]=new int[]{45,12,2,10};
        Arrays.fill(arr,1,2,8);
        for (int o=0;o<arr.length;o++){
            System.out.println("第"+o+"个元素是:"+arr[o]);
        }
    }
}
