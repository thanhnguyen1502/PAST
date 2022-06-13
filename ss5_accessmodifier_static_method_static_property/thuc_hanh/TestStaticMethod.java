package ss5_accessmodifier_static_method_static_property.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
//        gọi phương thức thay đổi
        Student.change();

//        tạo đối tượng
        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(222,"Khanh");
        Student s3 = new Student(333, "Nam");

//        gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
