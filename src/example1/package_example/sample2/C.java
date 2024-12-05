package example1.package_example.sample2;

//import example1.package_example.sample.A;
import example1.package_example.sample.B;

public class C {
    B b;
//    A a;
    // A클래스는 default 접근제어자이므로 타 패키지에서 접근 불가
    // B클래스는 public 접근제어자 이므로 타 패키지에서 접근 가능
}
