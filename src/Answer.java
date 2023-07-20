import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
    ArrayList <Integer> list = (ArrayList<Integer>) Arrays.stream(arr)
            .filter(x -> x%2 != 0)
                    .collect(Collectors.toList());
        // ArrayList<Integer> list =
             //   (ArrayList<Integer>) Arrays.stream(arr)
               //         .filter(s -> s%2 != 0)
              //          .toList();
        System.out.println(list);


    }
}
