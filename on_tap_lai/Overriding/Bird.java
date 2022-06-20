package on_tap_lai.Overriding;

public class Bird extends Animal{
    public Bird() {
        super("Chim");
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }

    @Override
    public void Eat() {
        System.out.println("ăn Sâu");
    }
}
