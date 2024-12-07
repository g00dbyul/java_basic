package example1.collection;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return this.name.equals(member.name) && this.age == member.age;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() + age;
    }
}
