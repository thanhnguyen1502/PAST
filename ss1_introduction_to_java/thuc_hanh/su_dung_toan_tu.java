package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        float width;   // float : là kiểu số thực
        float height;

        Scanner scanner = new Scanner(System.in); // khai báo đối tượng

        System.out.println("nhập chiều rộng vào đây: ");
        width = scanner.nextFloat();

        System.out.println("nhập chiều rộng vào đây: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("kết quả diện tích là : " + area);
    }
}
