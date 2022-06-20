package ss5_accessmodifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("chưa setter :" + circle);
        circle.setRadius(4.0);
        circle.setColor("Pink");
        System.out.println("sau khi set = " + circle);
        System.out.println(circle);
    }
}
