import java.util.LinkedHashSet;
import java.util.Set;

class PreservedOrder{
    public void getOrderedNumbers(){
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers);
    }
}

public class LinkedHashSetDemoMain {
    public static void main(String[] args) {
        new PreservedOrder().getOrderedNumbers();
    }
}
