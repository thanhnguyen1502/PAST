package ss5_accessmodifier_static_method_static_property.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

//    khai báo thuộc tính static numberOfCars
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
}
