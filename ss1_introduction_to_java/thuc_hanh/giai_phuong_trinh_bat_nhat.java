package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class giai_phuong_trinh_bat_nhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bật nhất");
        System.out.println("Cho phương trình là : 'a * x + b = c' hãy nhập các hằng số vào: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("nhập số b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0){
            System.out.println("phương trình có vô số nghiệm ");
        }else if (a ==0 && b != 0){
            System.out.println("phương trình vô nghiệm");
        }else {
            System.out.println(" phương trình có 1 nghiệm là: " + (-b/a));
        }
    }

}
