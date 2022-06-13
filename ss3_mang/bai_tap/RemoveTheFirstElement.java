package ss3_mang.bai_tap;

import My_Method.IntToArr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveTheFirstElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("phần tử trong mảng: " + Arrays.toString(arr));
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhấp vị trí x cần xoá: ");
        int x = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j <arr.length-1 ; j++) {
                arr[j] = arr[j-1];
            }
            arr[x] = a;

        }
        System.out.println("mảng sau khi xoá x là:" + Arrays.toString(arr));
    }
}
