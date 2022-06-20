package on_tap_lai.Overriding;

public class Cat extends Animal{
    public Cat() {
        super("mèo");
    }

    @Override
    public void makeSound() {
        System.out.println("weow weow");
    }

    @Override
    public void Eat() {
        System.out.println("ăn cá");
    }
}
