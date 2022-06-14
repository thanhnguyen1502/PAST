package ss6_ke_thua.thuc_hanh;

public class Shape {
    private String color = "green";
    private boolean felled = true;

    public Shape(){

    }

    public Shape(String color, boolean felled) {
        this.color = color;
        this.felled = felled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFelled() {
        return felled;
    }

    public void setFelled(boolean felled) {
        this.felled = felled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", felled=" + felled +
                '}';
    }
}
