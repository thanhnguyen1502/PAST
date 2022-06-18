package ss3_mang.bai_tap;

import My_Method.IntToArr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveTheFirstElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("phần tử trong mảng: " + Arrays.toString(arr));
        System.out.println("nhập vị trí cần xoá: ");
        int delete = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                check = true;
            }
        }
        if (!check) {
            System.out.println(delete + "không có vị trí này");
        } else System.out.println("mảng sau khi xoá: " + Arrays.toString(arr));
    }
}
