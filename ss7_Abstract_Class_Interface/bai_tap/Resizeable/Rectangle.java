package ss7_Abstract_Class_Interface.bai_tap.Resizeable;

public class Rectangle extends Square implements Resizeable{
    private double width;
    private double length;

    public Rectangle(){
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width/2;
    }

    @Override
    public void resize(double percent) {
        this.length = (this.length*(1+percent/100));
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Area= " + getArea() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
