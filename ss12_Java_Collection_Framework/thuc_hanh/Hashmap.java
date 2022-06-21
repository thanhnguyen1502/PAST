package ss12_Java_Collection_Framework.thuc_hanh;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        java.util.HashMap<String,String> city = new java.util.HashMap<>();
        city.put("Japan","Tokyo");
        city.put("China","backinh");
        city.put("england","london");
        city.put("Korea","SeUn");
        System.out.println(city);
        for (String t: city.keySet()) {
            System.out.println(t);
        }
        System.out.println();
        for (String td: city.values()) {
            System.out.println(td);
        }
        city.remove("Japan");   // xoá từng phần tử
//        System.out.println(city);
        for (String t: city.keySet()) {
            System.out.println(t);
        }
        
        city.clear();   // xoá toàn bộ
        System.out.println(city);
    }
}
