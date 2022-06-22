package ss12_Java_Collection_Framework.bai_tap.arrayList.service.impl;

import ss12_Java_Collection_Framework.bai_tap.arrayList.model.Product;
import ss12_Java_Collection_Framework.bai_tap.arrayList.service.IProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductSevice implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<>();
    static {
        productArrayList.add(new Product(1, "a", 2000));
        productArrayList.add(new Product(5, "d", 5000));
        productArrayList.add(new Product(3, "b", 4000));
        productArrayList.add(new Product(8, "c", 1000));
        productArrayList.add(new Product(2, "e", 3000));

    }

    @Override
    public void add() {
        System.out.println("nhập id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sang pham");
        String name = scanner.nextLine();
        System.out.println("nhập gia san pham");
        int gia = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, gia);
        // them mới dùng add()
        productArrayList.add(product);
       display();
    }

    @Override
    public void edit() {
       display();
        System.out.println(" chon san pham can sua ");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("nhập id san pham");
                productArrayList.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhập tên sang pham");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("nhập gia san pham");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
       display();
    }

    @Override
    public void delete() {
        display();
        System.out.println(" nhap san pham can xoa");
        int delete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (delete == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }
        }
        display();
    }

    @Override
    public void display() {
//        for (Object s : productArrayList) {
//            System.out.println(s);
//        }

        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i));
        }
    }

    @Override
    public void search(String name) {
        int count =0;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println(" tên cần tìm là:  " + productArrayList.get(i));
                break;
            }else {
                count++;
            }
        }if (count>0)
            System.out.println(" không có tên này");
    }


    @Override
    public void sort() {
        display();
        System.out.println("-------------------------------------------");
        productArrayList.sort(Comparator.comparing(Product::getName));
       display();
    }
}
