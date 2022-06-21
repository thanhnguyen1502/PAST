package ss12_Java_Collection_Framework.thuc_hanh;

import java.util.HashSet;

public class mainHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Cộng");
        hs.add("Hoà");
        hs.add("Xã");
        hs.add("Hội");
        hs.add("Chủ");
        hs.add("Nghĩa");
        hs.add("Việt");
        hs.add("Nam");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains("Chủ")); // kiểm tra phần tử có không (boolean)
        hs.remove("Chủ");
        System.out.println(hs); // xoá 1 phần tử
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
