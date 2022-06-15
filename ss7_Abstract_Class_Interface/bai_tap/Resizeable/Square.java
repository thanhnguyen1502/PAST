package ss7_Abstract_Class_Interface.bai_tap.Resizeable;

import ss6_ke_thua.thuc_hanh.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(String color, boolean filled) {

    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);

    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void resize(int i) {
        return ;
    }
}

