package ss5_accessmodifier_static_method_static_property.bai_tap;

public class Text {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());

        student.setName("Thành");
        System.out.println(student.getName());
        student.setClasses("c0422g1");
        System.out.println(student.getClasses());
    }
}
