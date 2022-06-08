package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("nhập sô tiền đầu tư: ");
        money = scanner.nextDouble();
        System.out.println("nhập vào số tháng: ");
        month = scanner.nextInt();
        System.out.println("nhập lãi suất hằng năm theo tỉ lệ % : ");
        interestRate = scanner.nextDouble();

        int totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("tổng số tiền lãi là: " + totalInterest);
    }
}
