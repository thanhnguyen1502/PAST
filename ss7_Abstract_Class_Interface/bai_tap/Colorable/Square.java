package ss7_Abstract_Class_Interface.bai_tap.Colorable;

import ss6_ke_thua.thuc_hanh.Shape;

public class Square extends Shape implements Colorable {
    double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return "Square{ " +
                "side = " + side + ", area = " + getArea()+
                " }";
    }


    @Override
    public void howToColor() {

    }
}

