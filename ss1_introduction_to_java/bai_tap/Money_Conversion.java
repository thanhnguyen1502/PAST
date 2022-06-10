package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND = 23000;
        double USD;
        System.out.print("mời bạn nhập số tiền USD vào đây: ");
        USD = scanner.nextDouble();
        double exchange = USD*VND;
        System.out.print("số tiền chuyển qua VND là: " + exchange + "VND");
    }
}
