package ss8_Clean_Code_Refactoring.thuc_hanh.Refacting;

import java.util.Scanner;

public class MainRefactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số thứ hai: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập phép tính : ");
        char operator = scanner.nextLine().charAt(0);
        System.out.println(Refactoring.calculate(number1,number2,operator));
    }
}
