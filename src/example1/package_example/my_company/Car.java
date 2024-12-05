package example1.package_example.my_company;

import example1.package_example.hankook.SnowTire;
import example1.package_example.hyundai.Engine;
import example1.package_example.kumho.BigWidthTire;

public class Car {
    Engine engine = new Engine();
    SnowTire snowTire = new SnowTire();
    BigWidthTire bigWidthTire = new BigWidthTire();

    // 이렇게도 쓸 수 있음, 다른 패키지의 클래스와 이름이 중복될 때, 이렇게 구분 가능
    example1.package_example.kumho.Tire tire = new example1.package_example.kumho.Tire();
    example1.package_example.hankook.Tire tire1 = new example1.package_example.hankook.Tire();
}
