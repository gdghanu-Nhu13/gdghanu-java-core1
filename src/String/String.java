package String;

class TestString {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" Nhu");  // KHÔNG lưu lại kết quả nối
        System.out.println(str);  // Output: Hello

        // Nếu muốn lưu:
        String newStr = str.concat(" Nhu");
        System.out.println(newStr);  // Output: Hello Nhu
    }
}
/*
String trong Java là immutable tức là không thể thay đổi. Còn khi mà bạn thay đổi
1 String Object trong Java thì 1 String object mới hoàn toàn sẽ được tạo ra mỗi lần bạn thay đổi.*/
