package ss11_Stack_Queue.bai_tap.lesson_4;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức: ");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!flag) {
            System.out.println("sai");
        } else if (stack.isEmpty()) {
            System.out.println("đúng");
        } else {
            System.out.println("sai");
        }
    }
}
