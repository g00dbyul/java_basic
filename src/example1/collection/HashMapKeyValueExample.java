package example1.collection;

import java.util.HashMap;

public class HashMapKeyValueExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // hashmap 데이터 추가
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("banana", 3);

        System.out.println(map);
        // key값으로 value 접근
        System.out.println(map.get("apple"));
        // 존재하지 않는 키값이면 null => 에러는 없음
        System.out.println(map.get("kiwi"));

        // key가 존재하는지 확인
        if (map.containsKey("orange")) {
            System.out.println(map.get("orange"));
        } else {
            System.out.println("Invalid Key");
        }

        // 수정, 있는 값에 덮어쓰기
        System.out.println(map.get("banana"));

        // 삭제
        map.remove("apple");
        // 없는거 삭제한다고 에러가 발생하진 않음
        map.remove("mango");
        System.out.println(map);
    }
}
