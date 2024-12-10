package example1.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // 배열을 할당하는 것이 아닌, 배열의 주소 값을 넘기게 된다. 그래서 두 변수는 같은 배열을 바라보게 됨.
        int[] arr2 = arr;

        arr[1] = 5;
        System.out.println(arr2[1]); // 5

        int[] arr3 = arr.clone(); // 동일한 배열을 복사
        arr3[1] = 10;
        System.out.println("arr3 : " + arr3[1]);
        System.out.println("arr : " +arr[1]);
    }
}
