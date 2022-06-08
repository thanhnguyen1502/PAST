package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class tao_menu_don_gian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Vẽ tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true) {
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hình tam giác! ");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Hình vuông! ");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");

                    break;
                case 3:
                    System.out.println("Hình chữ nhật! ");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");

                    break;
                case 0:
                    System.exit(choice);
                default:
                    System.out.println("không có! ");

            }
        }
    }
}
