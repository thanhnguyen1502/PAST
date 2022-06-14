package ss6_ke_thua.bai_tap.Point2DPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
    }
    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {getX(),getY(),this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Array of{" + " x=" + getX() + ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
