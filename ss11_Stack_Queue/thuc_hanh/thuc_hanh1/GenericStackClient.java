package ss11_Stack_Queue.thuc_hanh.thuc_hanh1;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kích thước sau khi hoạt động: " + stack.size());
        System.out.println("các phần tử được xoá: ");
        while (!stack.isEmpty()) {
            System.out.println( stack.pop());
        }
        System.out.println("kích thước của stack : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack1 = new MyGenericStack();
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        System.out.println("Size of stack after push operations: " + stack1.size());
        System.out.println("Pop elements from stack : ");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
        System.out.println("Size of stack after pop operations : " + stack1.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of integers");
        stackOfIntegers();
        System.out.println("Stack of Strings");
        stackOfIStrings();
    }
}


