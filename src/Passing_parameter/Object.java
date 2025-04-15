package Passing_parameter;

class Person {
    String name;
}
public class Object {
    public static void changeName(Person p) {
        p.name = "Nhu đẹp gái";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Nhu";
        changeName(person);
        System.out.println(person.name);  // Output: Nhu đẹp gái
    }
    //  Tên bị thay đổi, vì tham chiếu của person được truyền bản sao,
    //  nhưng cả 2 bản đều trỏ đến cùng 1 vùng nhớ
}
/*
Java luôn truyền bản sao của giá trị.

Nếu là kiểu nguyên thủy → bản sao là giá trị thật.

Nếu là đối tượng → bản sao là địa chỉ vùng nhớ (tham chiếu), nên nội dung có thể bị thay đổi.*/
