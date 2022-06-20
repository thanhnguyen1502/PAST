package ss5_accessmodifier_static_method_static_property.bai_tap;

public class Student {
    private String name = "Vinh";
    private String classes = "6/3";

    public Student(){
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setClasses(String cl) {
        this.classes = cl;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Tên='" + name + '\'' +
                ", Lớp='" + classes + '\'' +
                '}';
    }
}