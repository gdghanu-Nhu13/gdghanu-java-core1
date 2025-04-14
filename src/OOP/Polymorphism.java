package OOP;
// overloading cùng name nhưng khác datatype của parameter và datatype return, khác số lượng parameter truyền vào
// vì sao cần overloading: vì gọi cùng 1 hành động với nhiều kiểu tham số

// overriding class con ghi đè phương thức của class cha
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}