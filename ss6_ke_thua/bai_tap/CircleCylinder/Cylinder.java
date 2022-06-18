package ss6_ke_thua.bai_tap.CircleCylinder;

import java.text.DecimalFormat;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){

    }
    public Cylinder(double lenght) {
        this.height = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double lenght) {
        super(radius, color);
        this.height = lenght;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()* height;
    }

    @Override
    public String toString() {
        DecimalFormat f= new DecimalFormat("#0.00");
        return "Cylinder{" + "radius :" + getRadius()  +
                "volume :" +f.format( getVolume())+
                ", lenght=" + height +
                '}';
    }
}
