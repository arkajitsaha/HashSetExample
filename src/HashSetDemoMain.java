import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicate{
    public void getNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        Set<Integer> withoutDuplicate = new HashSet<>(numbers);
        List<Integer> numbersWithoutDuplicate = new ArrayList<>(withoutDuplicate);
        System.out.println(numbersWithoutDuplicate);
    }

}

public class HashSetDemoMain {
    public static void main(String[] args) {
        new RemoveDuplicate().getNumbers();
    }
}
