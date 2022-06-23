package ss14.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {3,4,2,6,5,8,7};
    public static void main(String[] args) {
        System.out.println("Trước khi duyệt: " + Arrays.toString(list));

        insertionSort(list);
        System.out.println("sau khi duyệt"+Arrays.toString(list));
    }
    public static void insertionSort(int [] array) {
        int pos;
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos>0 && x<array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            array[pos]= x;
        }
    }
}
