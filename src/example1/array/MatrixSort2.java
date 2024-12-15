package example1.array;

import java.util.Arrays;

public class MatrixSort2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o2[1], o1[1]));
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
