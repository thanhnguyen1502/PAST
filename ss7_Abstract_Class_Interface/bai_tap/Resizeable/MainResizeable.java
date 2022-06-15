package ss7_Abstract_Class_Interface.bai_tap.Resizeable;

public class MainResizeable {
    public static void main(String[] args) {
        Square [] shape = new Square[3];
        shape [0] = new Circle(2);
        shape [1] = new Square("red",false);
        shape [2] = new Square(4);
        System.out.println("Truoc khi tang");
        for (Square s: shape
        ) {
            System.out.println(s);
        }

        for (Square s: shape
        ) {
            if (s instanceof Circle) {
                ((Circle)s).resize(20);
            } else if (s instanceof Rectangle) {
                ((Rectangle)s).resize(50);
            } else {
                ((Square)s).resize(30);
            }
        }
        System.out.println("Sau khi tang");
        for (Square s: shape
        ) {
            System.out.println(s);
        }
    }
}
