package ss10_DSA_Danh_sach.thuc_hanh.List_Kantan;

public class MyListTest{
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element " + listInteger.get(3));
        System.out.println("element " + listInteger.get(1));
        System.out.println("element " + listInteger.get(2));

        System.out.println(listInteger);
        listInteger.ensureCapa();
        System.out.println(listInteger);

    }
}
