package ss11_Stack_Queue.bai_tap.lesson_1;

import java.util.Scanner;
import java.util.Stack;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("nhập chuỗi: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i)+"");

        }
        System.out.println("chuỗi đảo! ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
