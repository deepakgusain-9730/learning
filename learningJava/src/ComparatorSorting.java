import java.util.Arrays;

public class ComparatorSorting {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr, (Integer v1, Integer v2) -> v2 - v1);
        System.out.println(Arrays.toString(arr));
    }
}
