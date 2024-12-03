package example1.array;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] array = {"java", "array", "copy"};
        String[] copyArray = new String[5];

        System.arraycopy(array, 0, copyArray, 0, array.length);

        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(copyArray[i]);
        }
    }
}
