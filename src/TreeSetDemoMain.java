import java.util.Set;
import java.util.TreeSet;

class SortedNumbers{
    public void getSortedNumbers(){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(5);

        System.out.println(numbers);
    }
}

public class TreeSetDemoMain {
    public static void main(String[] args) {
        new SortedNumbers().getSortedNumbers();
    }
}
