package My_Method;

import com.sun.media.sound.RIFFInvalidDataException;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
        static Student[] students = new Student[10];
        static {
            students[0] = new Student(1,"Thanh", "QN", true, "0372864453");
            students[1] = new Student(2,"Ngan", "HN", false, "06969696969");
            students[2] = new Student(3,"Ngan", "HN", false, "06969696969");
            students[3] = new Student(4,"Ngan", "HN", false, "06969696969");
            students[4] = new Student(5,"Ngan", "HN", false, "06969696969");
            students[5] = new Student(6,"Ngan", "HN", false, "06969696969");
        }
        public void display(){
            for (Student s: students){
                if(s!=null){
                    System.out.println(s);
                }else {
                    break;
                }
            }
        }
        public void add(){
            System.out.println("nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("nhập giới tính");
            Boolean gender = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("nhập số điện thoại: ");
            String phonenumber = scanner.nextLine();
            Student student = new Student(id,name,address,gender,phonenumber);
            for (int i = 0; i < students.length; i++) {
                if (students[i]==null){
                    students[i]=student;
                    break;
            }

        }
    }
    public void delete(){
        System.out.println("nhập vị trí cần xoá");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = index; i < students.length-1; i++) {
            students[i]=students[i+1];
        }
        display();
    }
    public void edit(){
        System.out.println("nhập vị trí cần sửa");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính");
        Boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập số điện thoại: ");
        String phonenumber = scanner.nextLine();
        Student student = new Student(id,name,address,gender,phonenumber);
        students[index]=student;
    }

}
