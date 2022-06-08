package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cậu muốn tìm số ngày của tháng nào ? ");
        int month = scanner.nextInt();// int: kiểu nguyên thuỷ
        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

//                System.out.print("Tháng : " + month + " có 31 ngày! ");
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.print("Tháng : " + month + "có 30 ngày ! ");
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")) System.out.printf("Tháng '%d' sẽ có %s ngày! ", month,daysInMonth);
        else System.out.print("đầu vào không đúng! ");

    }
}
