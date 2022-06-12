package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import com.sun.org.apache.bcel.internal.generic.FASTORE;

public class Build_Fan {


        final int SLOW = 1, MEDIUM = 2;
        final int FAST = 3;

        private int speed = SLOW;//tốc độ quạt
        private boolean on = false;//bật hay tắt
        private double radius = 5;//bán kính quạt
        private String color = ("blue");

        public Build_Fan() {
        }

        public Build_Fan(int speed, boolean on, double radius, String color) {
                this.speed = speed;
                this.on = on;
                this.radius = radius;
                this.color = color;
        }

        public int getSLOW() {
                return SLOW;
        }

        public int getMEDIUM() {
                return MEDIUM;
        }

        public int getFAST() {
                return FAST;
        }

        public int getSpeed() {
                return speed;
        }

        public boolean isOn() {
                return on;
        }

        public double getRadius() {
                return radius;
        }

        public String getColor() {
                return color;
        }

        public void setSpeed(int speed) {
                this.speed = speed;
        }

        public void setOn(boolean on) {
                this.on = on;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }

        public void setColor(String color) {
                this.color = color;
        }

        @Override
        public String toString() {
                if (this.on==true){
                        return "Build_Fan{" +
                                ", speed=" + speed +
                                ", radius=" + radius +
                                ", color='" + color + '\'' +
                                '}';
                }else return "Build_Fan{" +

                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';

        }

        public static void main(String[] args) {
                Build_Fan fan1= new Build_Fan(3,true,10,"yellow" + " fan is on");
                Build_Fan fan2= new Build_Fan(1,false,5,"blue" + " fan is off");

                System.out.println (fan1.toString());
                System.out.println(fan2.toString());


        }
}
