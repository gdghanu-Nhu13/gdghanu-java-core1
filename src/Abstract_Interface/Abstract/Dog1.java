package Abstract_Interface.Abstract;

public class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof woof!");
    }
}
