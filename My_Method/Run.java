package My_Method;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        StudentManager studentManager = new StudentManager();
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3.Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("chức năng hiện thị");
                    studentManager.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới");
                    studentManager.add();

                    break;
                case 3:
                    System.out.println("chức năng xóa");
                    studentManager.delete();
                  break;


                case 4:
                    System.out.println("chức năng sửa");
                    studentManager.edit();
                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

}
