
import java.util.Arrays;

class ArrayOperation {

    public static void main(String args[]) {
        int a[] = {7, 2, 9, 4, 1};
        Arrays.sort(a);
        //Arrays.parallelSort() is used for larger datasets
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 4));//works only on sorted arrays
    }
}
