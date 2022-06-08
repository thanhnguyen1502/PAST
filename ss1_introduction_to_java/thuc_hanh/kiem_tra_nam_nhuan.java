package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm vào đây: ");
        year = scanner.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("đây là năm nhuận");
            } else {
                System.out.println("không phải năm nhuận");
            }
        } else if (year % 4 == 0) {
            System.out.println("đây là năm nhuận");
        } else {
            System.out.println("không phải năm nhuận");
        }
    }
}
