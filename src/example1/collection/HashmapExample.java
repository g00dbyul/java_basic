package example1.collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(1, "HGD"), 95);
        map.put(new Student(1, "HGD"), 95);

        System.out.println(map.size());
    }
}
