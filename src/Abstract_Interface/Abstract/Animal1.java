package Abstract_Interface.Abstract;

abstract class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public abstract void makeSound();  // lớp con phải override
}

/*
Đn:
Là một lớp không thể tạo đối tượng trực tiếp, dùng để định nghĩa khung (template) cho các lớp con. Nó có thể chứa:

Phương thức abstract (không có thân hàm – bắt buộc lớp con override).

Phương thức bình thường (có thân hàm).

Biến, constructor,...

dùng?
Khi các lớp con có điểm chung, nhưng mỗi lớp cụ thể sẽ triển khai chi tiết riêng.

Muốn cho lớp cha viết sẵn một phần logic, phần còn lại để lớp con triển khai.*/
