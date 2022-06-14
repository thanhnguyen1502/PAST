package ss6_ke_thua.bai_tap.CircleCylinder;

import ss6_ke_thua.bai_tap.CircleCylinder.Circle;

import java.text.DecimalFormat;

public class Cylinder extends Circle {
    private double lenght = 1.0;

    public Cylinder(){

    }
    public Cylinder(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Cylinder(double radius, String color, double lenght) {
        super(radius, color);
        this.lenght = lenght;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*lenght;
    }

    @Override
    public String toString() {
        DecimalFormat f= new DecimalFormat("#0.00");
        return "Cylinder{" + "radius :" + getRadius()  +
                "volume :" +f.format( getVolume())+
                ", lenght=" + lenght +
                '}';
    }
}
