package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class prime_first_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 2;


        System.out.println("những số nguyên tố nhỏ hơn 100 gồm có: ");
        while (numbers < 100) {
            int tmp = 0;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println(numbers);

            }
            numbers++;
        }
    }
}



