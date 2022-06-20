package on_tap_lai.Overloading;

public class TestMain {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.timMin(435,4565));
        System.out.println(mm.tinhTong(345,456));
        double arr[] = new double[]{1,2,3,4,5};
        System.out.println(mm.tinhTong(arr));
    }
}
