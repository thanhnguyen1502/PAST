package ss3_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Element_To_Aarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("độ dài mảng là 10: ");
        int[] arr = new int[10];
        System.out.println("nhập từng phần tử của mảng: ");

        for (int i = 0; i < 8; i++) {

            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập x là số phần tử cần chèn");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí cần chèn");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index > arr.length - 1) {
            System.out.println("không tồn tại vị trí");
        } else {
            for (int j = arr.length - 1; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = x;
        }
        System.out.println(Arrays.toString(arr));

    }
}
