package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("nhập cân nặng vào đây: ");
        weight = scanner.nextDouble();
        System.out.println("nhập chiều cao vào đây: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("chỉ số bmi của bạn là: " + bmi);

        if (bmi <18.5){
            System.out.println("quá ốm yếu");
        }else if (bmi <25){
            System.out.println("bình thường");
        }else  if (bmi<30){
            System.out.println("Thừa cân");
        }else {
            System.out.println("Mập ịt");
        }
    }
}
