package ss5_accessmodifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());

        circle.setRadius(4.0);
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
    }
}
