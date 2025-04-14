package String;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Nhu";
        String s2 = "Nhu";
        String s3 = new String("Nhu");  // tạo đối tượng mới, không dùng pool

        System.out.println(s1 == s2);  // true → cùng địa chỉ trong pool
        System.out.println(s1 == s3);  // false → khác địa chỉ
        System.out.println(s1.equals(s3));  // true → so sánh nội dung
    }
}
/*
Khi khai báo String bằng dấu " thì Java sẽ lưu trong pool.

Nếu chuỗi giống nhau, Java sẽ tái sử dụng chuỗi cũ để tiết kiệm bộ nhớ.*/
