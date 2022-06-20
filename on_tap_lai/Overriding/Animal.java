package on_tap_lai.Overriding;

public class Animal {
    private String Name;

    public Animal(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void makeSound(){
        System.out.println("kimochiii");
    }
    public void Eat(){
        System.out.println("gì cũng được");
    }
    public void Sleep(){
        System.out.println("Zzzzzzz");
    }
}
