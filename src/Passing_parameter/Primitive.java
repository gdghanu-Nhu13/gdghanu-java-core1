package Passing_parameter;
//  Java pass-by-value
public class Primitive {
    public static void change(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        change(a);
        System.out.println(a);  // Output: 5 (vẫn giữ nguyên)
    }

}
//Java không truyền biến a gốc mà chỉ truyền giá trị của nó.