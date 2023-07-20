import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Answer3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> sort = (ArrayList<Integer>) Arrays.stream(arr)
                .sorted()
                .collect(Collectors.toList());
        int min = Arrays.stream(arr).min(Integer::compare).get();
        int max = Arrays.stream(arr).max(Integer::compare).get();
        double average = Arrays.stream(arr)
                .collect(Collectors.averagingInt(Integer::valueOf));
        System.out.println(sort);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);
    }
}
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5