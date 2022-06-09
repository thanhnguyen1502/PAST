package My_Method;

import java.util.Arrays;
import java.util.Scanner;

public class IntToArr {
    public static void main(String[] args) {
        IntToArr();
    }

    public static int[] IntToArr() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("phần tử trong mảng: " + Arrays.toString(arr));
        return arr;

    }
}
