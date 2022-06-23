package ss11_Stack_Queue.bai_tap.lesson_3;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        System.out.println("Nhập chuỗi cần kiểm tra! ");
        String banana = sc.nextLine();
        String newBanana = banana.toLowerCase();
        for (int i = 0; i < newBanana.length(); i++) {
            st.push(newBanana.charAt(i));
        }
        System.out.println(st);
        if (isTrue(newBanana, st)) {
            System.out.println("Là chuỗi Palindrome");
        } else {
            System.out.println("Không phải chuỗi palindrome");
        }
    }

    public static boolean isTrue(String banana, Stack<Character> stack) {
        for (int i = 0; i < banana.length(); i++) {
            if (banana.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
