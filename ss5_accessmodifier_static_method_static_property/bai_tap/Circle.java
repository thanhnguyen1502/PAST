package ss5_accessmodifier_static_method_static_property.bai_tap;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
}



