package ss3_mang.bai_tap;

public class thuattoan {
    public static void main(String[] args) {

        for (int i = 1; i<= 6;i++){
            for (int j = 1;j <=6; j++ ) {
                if (j <= 6 - i) {
                    System.out.print("  ");
                } else if (j == 6 - i + 1 || i == 6) {
                    System.out.print(j);
                } else {
                    System.out.print("  ");
                }
            }

            for (int k=0;k<i-1;k++){
                if (k== i-2|| i==6 ){
                    System.out.print(k);
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}




