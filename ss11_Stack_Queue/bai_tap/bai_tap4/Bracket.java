package ss11_Stack_Queue.bai_tap.bai_tap4;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("nhập chuỗi phương thức! ");
        String equation = sc.nextLine();
        String left = "(";
        String right = ")";
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i)==left.charAt(0)){
                st.push(equation.charAt(i));
            }
            if (equation.charAt(i)==right.charAt(0)){

            }
        }
    }
}
