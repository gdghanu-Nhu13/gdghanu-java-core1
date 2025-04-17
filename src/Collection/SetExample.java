package Collection;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        // Đếm số phần tử duy nhất
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Số từ duy nhất: " + uniqueWords.size());
        System.out.println("Các từ duy nhất: " + uniqueWords);
    }
}
