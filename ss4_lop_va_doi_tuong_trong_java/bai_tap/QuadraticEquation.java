package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5));
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập giá trị a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập giá trị b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập giá trị c: ");
        double c = Integer.parseInt(scanner.nextLine());
         QuadraticEquation square = new QuadraticEquation(a,b,c);
        System.out.println("Detal : " + square.getDiscriminant());
        if (square.getDiscriminant()>0){
            System.out.println("có 2 nghiệm: " + square.getRoot1() + " , " + square.getRoot2()) ;
        }
        else if (square.getDiscriminant()==0){
            System.out.println("có 1 nghiệm: " + square.getRoot2());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
