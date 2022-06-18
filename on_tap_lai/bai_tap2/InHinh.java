package on_tap_lai.bai_tap2;

public class InHinh {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
        System.out.println(" ");
        for (int i = 5; i >0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }

            System.out.println(" * ");
        }

        System.out.println(" ");
        for (int i = 1; i <=5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }

            System.out.println(" * ");
        }
    }
}
