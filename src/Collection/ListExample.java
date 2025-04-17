package Collection;
import java.util.stream.Collectors;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Linh", "An", "Bảo", "Linh", "Tuấn");

        // Lọc ra tên dài hơn 3 kí tự, viết hoa, sắp xếp
        List<String> processed = names.stream()
                .filter(name -> name.length() > 3) // lọc theo đk
                .map(String::toUpperCase) // biến đổi phần tử
                .distinct() // loại trùng
                .sorted() // sắp xếp
                .collect(Collectors.toList()); // chuyển veef list

        System.out.println("Danh sách xử lý: " + processed);
    }
}
