package OOP;
// Ẩn chi tiết và chỉ hiển thị phần cần thiết qua lớp abstract hoặc interface

// abstract dùng extend
// interface dùng implements
abstract class Vehicle {
    abstract void move();
    public void fuel() {
        System.out.println("Using fuel");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving on road");
    }
}