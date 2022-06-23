package ss14.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list){
        int temp;
        for (int i = 0; i < list.length-1; i++) {
            for (int j = list.length-1; j > i; j--) {
             if (list[j]<list[j-1]){
                 temp = list[j];
                 list[j]=list[j-1];
                 list[j-1]=temp;
                }
            }
        }
    }
}