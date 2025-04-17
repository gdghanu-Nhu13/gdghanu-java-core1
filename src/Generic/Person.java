package Generic;

import javax.print.Doc;

public abstract class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
// cac lop con cua person
class Worker extends Person{
    public Worker(String name) {
        super(name);
    }
}

class Doctor extends Person{
    public Doctor(String name) {
        super(name);
    }
}

// lop nay ko phai la person
class Dog{
    private String breed;
    public Dog(String breed) {
        this.breed = breed;
    }
}