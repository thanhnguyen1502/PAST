package ss5_accessmodifier_static_method_static_property.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

//    hàm khởi tạo để khởi tạo biến
    Student (int r, String n){
        rollno = r;
        name = n;
    }

//    phương thức static để thay đổi giá trị của biến static
    static void change(){
        college = "CodeGym";
    }

//    hiển thị giá trị
    void display(){
        System.out.println(rollno + "" + name + "" + college);
    }
}
