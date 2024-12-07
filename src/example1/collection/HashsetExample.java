package example1.collection;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("HGD", 30));
        set.add(new Member("HGD", 30));

        System.out.println(set.size());
    }
}
