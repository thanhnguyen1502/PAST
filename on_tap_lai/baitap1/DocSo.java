package on_tap_lai.baitap1;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số vào đây: ");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nice");
                    break;


            }
        } else if (number < 20) {
            switch (number % 10) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fouteen");
                    break;
                case 5:
                    System.out.println("fiften");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("senventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("niceteen");
                    break;
            }
        } else if (number < 100) {
            int tram = number / 10;
            int choc = number % 10;
            switch (choc) {

                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("nicety");
                    break;
            }

            switch (tram) {
//                case 1:
//                    System.out.println("one");
//                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nice");
                    break;
            }
        }
    }
}
