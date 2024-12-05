package example1.extend;

public class StudentExmple {
    public static void main(String[] args) {
        Student student = new Student("John", "1234456-1233434", 1);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
