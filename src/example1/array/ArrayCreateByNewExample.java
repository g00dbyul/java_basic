package example1.array;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("i = " + arr1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("i = " + arr1[i]);
        }

        double[] arr2 = new double[3];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i = " + arr2[i]);
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i = " + arr2[i]);
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("i = " + arr3[i]);
        }

        arr3[0] = "a";
        arr3[1] = "b";
        arr3[2] = "c";

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("i = " + arr3[i]);
        }
    }
}
