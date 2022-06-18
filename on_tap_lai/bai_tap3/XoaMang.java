package on_tap_lai.bai_tap3;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 6; i++) {
            System.out.println("nhập phần tử trong mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("phần tử trong mảng " + Arrays.toString(arr));
        System.out.println("nhập vị trí cần xoá : ");
        int delete = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (delete == arr[i]){
                for (int j = 0; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }

                check = true;
            }
        }
    }
}

