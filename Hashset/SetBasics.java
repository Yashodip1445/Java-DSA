import java.util.*;

public class SetBasics {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);

        System.out.println(numbers); // [20, 10, 30] (order may vary)
        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(50)); // false
        numbers.remove(10);
          System.out.println(numbers.contains(10)); 
          System.out.println(numbers.size()); // number of elements


    }
}
