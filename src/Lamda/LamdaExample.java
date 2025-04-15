package Lamda;

import java.util.*;
import java.util.stream.*;

public class LamdaExample {
    public static void main(String[] args) {
        // Ví dụ 1: Lambda Expression để tính tổng hai số
        SumInterface sumInterface = (a, b) -> a + b;
        int sumResult = sumInterface.sumOfNumber(10, 15);
        System.out.println("Sum using Lambda: " + sumResult);

        // Ví dụ 2: Sử dụng Optional để tránh NullPointerException
        Optional<Integer> optionalNumber = Optional.ofNullable(null);
        System.out.println("Optional value (orElse used): " + optionalNumber.orElse(0));

        // Ví dụ 3: Dùng Stream API để lọc và tính tổng các số lẻ
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int oddSum = numberList.stream()
                .filter(n -> n % 2 != 0) // Lọc các số lẻ
                .reduce(0, Integer::sum); // Tính tổng các số lẻ
        System.out.println("Sum of odd numbers: " + oddSum);

        // Ví dụ 4: Sử dụng Stream API với map để nhân mỗi số với 2
        List<Integer> doubleNumbers = numberList.stream()
                .map(n -> n * 2) // Nhân mỗi số với 2
                .collect(Collectors.toList());
        System.out.println("Doubled numbers: " + doubleNumbers);

        // Ví dụ 5: Sử dụng removeIf để loại bỏ các số chẵn trong một danh sách
        List<Integer> numbersList = new ArrayList<>(numberList);
        numbersList.removeIf(n -> n % 2 == 0); // Loại bỏ các số chẵn
        System.out.println("List after removing even numbers: " + numbersList);

        // Ví dụ 6: Sử dụng Set để loại bỏ các phần tử trùng lặp
        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println("Set (duplicates removed): " + numberSet);
    }
}

// Functional Interface với một phương thức duy nhất
@FunctionalInterface
interface SumInterface {
    int sumOfNumber(int a, int b);
}
