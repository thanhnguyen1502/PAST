package ss5_accessmodifier_static_method_static_property.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println("Tổng số xe là : "+ Car.numberOfCars + " " +car1);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println("Tổng số xe là : "+Car.numberOfCars+ " " +car2);
    }
}
