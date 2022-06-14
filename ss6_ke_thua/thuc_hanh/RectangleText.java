package ss6_ke_thua.thuc_hanh;

public class RectangleText {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        rectangle = new Rectangle(5,6,"red",true);
        System.out.println(rectangle);
    }
}
