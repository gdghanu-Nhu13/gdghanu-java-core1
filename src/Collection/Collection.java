package Collection;

import java.util.*;


public class Collection {
    public static void main(String[] args) {

        // LIST 	Danh sách có thứ tự, cho phép trùng
        System.out.println("=== LIST (Danh sách) ===");
        List<String> fruits = new ArrayList<>();
        fruits.add("Táo");
        fruits.add("Chuối");
        fruits.add("Cam");
        fruits.add("Xoài"); // thêm phần tử

        System.out.println("Danh sách trái cây: " + fruits);
        System.out.println("Trái đầu tiên: " + fruits.get(0));
        System.out.println("Số lượng trái cây: " + fruits.size());
        System.out.println("Có Chuối không? " + fruits.contains("Chuối"));

        // SET Tập hợp không trùng, không có thứ tự
        System.out.println("\n=== SET (Tập hợp không trùng) ===");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // không thêm lại vì đã có
        numbers.add(4);

        System.out.println("Tập hợp số: " + numbers);

        //  MAP Key là duy nhất, không trùng nhau.
        //
        //Value thì có thể trùng.
        System.out.println("\n=== MAP (Ánh xạ key - value) ===");
        Map<String, String> student = new HashMap<>();
        student.put("name", "Nhu");
        student.put("major", "CNTT");
        student.put("school", "UIT");
        student.put("grade", "A");
// "name" là key

//"Nhu" là value

//.put(key, value) dùng để thêm hoặc cập nhật

//.get(key) dùng để lấy giá trị ứng với key
        System.out.println("Tên sinh viên: " + student.get("name"));
        System.out.println("Có thông tin tuổi không? " + student.containsKey("age"));
        System.out.println("Toàn bộ thông tin: " + student);
    }
}
