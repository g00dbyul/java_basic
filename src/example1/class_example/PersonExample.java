package example1.class_example;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("aaaaaa", "길동");
        System.out.println(p1.nation);
        System.out.println(p1.name);
        System.out.println(p1.ssn);

//        p1.nation = "";
//        p1.ssn = "";
        // final variable은 변경 불가
    }
}
