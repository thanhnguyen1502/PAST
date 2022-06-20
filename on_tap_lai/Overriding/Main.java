package on_tap_lai.Overriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("test dog: ");
        Dog d = new Dog();
        d.Sleep();
        d.Eat();
        d.makeSound();
        System.out.println("test cat: ");
        Cat c = new Cat();
        c.Sleep();
        c.Eat();
        c.makeSound();
        System.out.println("test Bird: ");
        Bird b = new Bird();
        b.Sleep();
        b.Eat();
        b.makeSound();
    }
}
