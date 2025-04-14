package Abstract_Interface;


interface Flyable {
    void fly();
}


class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying high!");
    }
}

/*
 Đn
Là một bản thiết kế hoàn toàn trừu tượng (trước Java 8 không có thân hàm). Interface chứa:

Các phương thức trừu tượng (mặc định là public abstract).

Biến (mặc định là public static final).

Java 8+ còn có default, static methods.

dùng?
Khi muốn ép các lớp khác cùng tuân theo một “cam kết”, nhưng không cần chia sẻ code.

Dùng cho đa kế thừa kiểu interface (Java không hỗ trợ đa kế thừa class).*/
