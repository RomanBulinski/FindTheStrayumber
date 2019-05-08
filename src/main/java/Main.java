import java.util.Arrays;
import java.util.HashMap;

public class Main {


    static int stray(int[] numbers) {
        int numReturn = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : numbers) {
            if (!hashmap.containsKey(num)) {
                hashmap.put(num, 1);
            } else {
                int counter = hashmap.get(num);
                hashmap.put(num, counter + 1);
            }
        }
        for (Integer number : hashmap.keySet()) {
            if (hashmap.get(number) == 1) {
                numReturn = number;
            }
        }
        return numReturn;
    }


    static int strayFromCodeWars(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }



}
