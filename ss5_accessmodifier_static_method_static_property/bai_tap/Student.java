package ss5_accessmodifier_static_method_static_property.bai_tap;

public class Student {
    private String name = "Jorn";
    private String classes = "C02";

    public Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
