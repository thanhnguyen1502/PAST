package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhập giá trị a: ");
        a = scanner.nextInt();
        System.out.println("nhập giá trị b: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a ==b || b == 0){
            System.out.println("không có ước chung lớn nhất ");
        }
        while (a!= b){
            if (a>b){
                a = a -b;
            }
            else {
                b = b -a;

            }
            System.out.println("ước chung lớn nhất là: " + a);
        }


    }
}
