package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên vào đây: ");
        String name = scanner.nextLine();
        System.out.println("Chào cậu " + name + " nha!!");

    }
}
