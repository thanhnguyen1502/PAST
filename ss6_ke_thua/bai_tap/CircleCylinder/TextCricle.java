package ss6_ke_thua.bai_tap.CircleCylinder;

import ss6_ke_thua.bai_tap.CircleCylinder.Circle;

public class TextCricle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());

        circle = new Circle(2,"blue");
        System.out.println(circle.getArea());
    }
}
