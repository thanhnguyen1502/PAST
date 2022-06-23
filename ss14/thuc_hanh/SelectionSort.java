package ss14.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
      int[] list = {1,5,0,2,1,9,9,7};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(int [] array){
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}
