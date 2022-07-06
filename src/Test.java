import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(2, "Lokesh", "Gupta") );
        list.add( new Employee(1, "Alex", "Gussin") );
        list.add( new Employee(4, "Brian", "Sux") );
        list.add( new Employee(5, "Neon", "Piper") );
        list.add( new Employee(3, "David", "Beckham") );
        list.add( new Employee(7, "Alex", "Beckham") );
        list.add( new Employee(6, "Brian", "Suxena") );
        list.add( new Employee(8, "Alex", "Fergussion") );

//        list.stream()
//                .sorted(Comparator.comparing(list::get())).collect(Collectors.toList()).forEach(System.out::println);

//        Collections.sort(list);

//
//        for (int i = 0; i < list.size(); i ++) {
//            System.out.println(list.get(i));
//        }

    }
}
