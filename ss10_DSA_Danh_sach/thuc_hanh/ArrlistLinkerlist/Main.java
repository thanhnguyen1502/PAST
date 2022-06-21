package ss10_DSA_Danh_sach.thuc_hanh.ArrlistLinkerlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> phone = new ArrayList<>();
        phone.add("Phone");
        phone.add("Samsung");
        phone.add("Iphone");
        phone.add("Motorola");
        for (String t : phone) {
            System.out.println(t);
        }
        System.out.println("Vị trí: "+phone.get(3)); // tham chiếu đến số chỉ định

        System.out.println("sau khi đổi");
        phone.set(0, "Nokia");
        phone.remove(2);
        for (String p : phone) {
            System.out.println(p);
        }
    }
}
