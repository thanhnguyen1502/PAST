package ss6_ke_thua.bai_tap.Point2DPoint3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Array of{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
