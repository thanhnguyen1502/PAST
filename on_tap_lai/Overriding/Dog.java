package on_tap_lai.Overriding;

public class Dog extends Animal{
    public Dog() {
        super("Chó");
    }

    @Override
    public void makeSound() {
        System.out.println("gâu gâu");    }

    @Override
    public void Eat() {
        System.out.println("ăn thịt");    }
}
