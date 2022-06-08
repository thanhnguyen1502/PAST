package ss2_vong_lap_trong_java.bai_tap;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        System.out.println("Exit");
        System.out.println("hình tam giác vuông! ");
        System.out.println("hình tam giác cân");
        System.out.println("hình chữ nhật! ");
        System.out.println("chọn hình ");

        while (true){
            choice = input.nextInt();


            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                    
                case 4:
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 0:
                    System.exit(choice);
                default:
                    System.out.println("không có");


            }
        }
    }
}
