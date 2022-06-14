package ss6_ke_thua.bai_tap.Point2DPoint3D;

public class Poin3DText {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.5f,4.5f,5.5f);
        System.out.println(point3D.getXYZ());
    }
}
