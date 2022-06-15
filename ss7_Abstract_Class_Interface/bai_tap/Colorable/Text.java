package ss7_Abstract_Class_Interface.bai_tap.Colorable;

import ss6_ke_thua.thuc_hanh.Rectangle;
import ss6_ke_thua.thuc_hanh.Shape;
import ss7_Abstract_Class_Interface.bai_tap.Resizeable.Circle;

public class Text {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2.0);
        shapes[1] = new Rectangle(2.0,3.0);
        shapes[2] = new Circle(5.0);
        for (Shape s: shapes) {
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }
            System.out.println(s);
        }
    }
}
