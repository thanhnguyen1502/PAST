package ss13_search_algorithm.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập chuỗi: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("before :"  +Arrays.toString(list));
        int pos;
        int x;
        for (int i = 1; i < list.length ; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
        System.out.println("Affer : "+Arrays.toString(list));
    }
}
