package example1.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JDBC");
        list.add("JSP");
        list.add(2, "DB");
        list.add("Oracle");

        int size = list.size();
        System.out.println(size);
        System.out.println();

        String skill = list.get(2);
        System.out.println(skill);
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + list.get(i));
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("Oracle");

        for(String str: list) {
            System.out.println(str);
        }
    }
}
