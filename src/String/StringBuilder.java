package String;
// Dùng khi cần thay đổi chuỗi nhiều lần trong 1 thread
class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Nhu");
        System.out.println(sb);  // Output: Hello Nhu
    }
}

class HelloWorld {
    public static void main(String args[]){
        StringBuilder sbd = new StringBuilder("0");
        for (int i = 0; i < 100; i++) {
            sbd.append(", "+i);
        }
    }
}

/*
StringBuilder Class làm cho String class trở nên linh động hơn vì
nó có thể tạo ra một set của các chuỗi kí tự có thể thay đối tượng. StringBuilder
Class cũng có một loạt các methods (phương thức) để tương tác hay tác động lên các String objects như trong String Class*/
