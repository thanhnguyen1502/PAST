package ss11_Stack_Queue.bai_tap.bai_tap2;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("nhập một số nguyên dương vào đây: ");
        int x = sc.nextInt();
        while (x>0){
            int Surplus = x%2;
            System.out.println(Surplus);
            stack.push(Surplus);
            x=x/2;
        }
        System.out.println("số nhị phân là: ");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}
