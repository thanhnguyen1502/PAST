package ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = new int[5];
        System.out.println("nhập phần tử trong mảng 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        int [] arr2 = new int[4];
        System.out.println("nhập phần tử trong mảng 2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng 1: " + Arrays.toString(arr1));
        System.out.println("mảng 2: " + Arrays.toString(arr2));
        int [] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i- arr1.length];
        }
        System.out.println("Mảng 3 là : " + Arrays.toString(arr3));

    }
}
