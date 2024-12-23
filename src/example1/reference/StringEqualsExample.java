package example1.reference;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "HGD";
        String strVar2 = "HGD";

        if (strVar1 == strVar2) {
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("같은 리터럴");
        }

        String strVar3 = new String("HGD");
        String strVar4 = new String("HGD");

        System.out.println(strVar3 == strVar4);

        if (strVar3 == strVar4) {
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("같은 리터럴");
        }
    }
}
