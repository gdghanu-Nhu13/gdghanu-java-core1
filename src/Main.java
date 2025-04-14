import OOP.Encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
            person.setName("phuong");
            person.setAge(19);

        System.out.println("name: " + person.getName());
        System.out.println("age: " + person.getAge());
    }
}