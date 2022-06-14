package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  range = 23000;
        double USD;
        System.out.print("mời bạn nhập số tiền USD vào đây: ");
        USD = scanner.nextDouble();
        double VND = USD*range;
        System.out.print("số tiền chuyển qua VND là: " + VND + "VND");
    }
}
