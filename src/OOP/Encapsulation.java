package OOP;
// Che giấu dữ liệu và chỉ cho phép truy cập thông qua các phương thức (getter/setter)
public class Encapsulation {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
