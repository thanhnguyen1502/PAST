package ss7_Abstract_Class_Interface.thuc_hanh.Animal_interface_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Checken: ò..ó...o..ò..";
    }
    @Override
    public String howToEat(){
        return "có thể thịt được! ";
    }
}
