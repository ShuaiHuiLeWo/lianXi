import javax.swing.*;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
    int [] array={12,47,52,63,99,24};
    BubbleSort sorter=new BubbleSort();
    sorter.sort(array);
    }
    public void sort(int[]array){
        for(int i=1;i<array.length;i++){
            for (int j=0;j<array.length-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        showArray(array);
    }
    public void showArray(int[]array){

        for (int i:array){
            System.out.print("<"+i);
        }
        System.out.println();
    }

}
