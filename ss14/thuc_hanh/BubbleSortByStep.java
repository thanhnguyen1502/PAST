package ss14.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter list size");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter" + list.length + "value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
//        System.out.println(Arrays.toString(list));
        bubbleSortStep(list);
        System.out.print(Arrays.toString(list));
    }

    public static void bubbleSortStep(int[] list) {
        boolean flag = true;
        int temp = 0;
        for (int i = 0; i < list.length - 1 && flag; i++) {
            flag = false;
            temp=list[i];
            for (int j = list.length-1; j > i; j--) {
                if (list[j] < list[j - 1]){
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j-1] = temp;
                    flag = true;
                    System.out.println(Arrays.toString(list));
                }
            }
        }
    }
}
