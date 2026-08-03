
import java.util.*;

class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value");
        int target = sc.nextInt();
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("enter array elements");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int index = binSearch(arr, target);
        if (index == -1) {
            System.out.println("target not found");
        } else {
            System.out.print("target present at index:" + index);
        }
        sc.close();
    }

    public static int binSearch(int arr[], int target) {
        //checking whether the array is sorted or not, if not then sorting it
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] <= arr[i + 1])) {
                Arrays.sort(arr);
                break;
            }
        }
        int l = 0;
        int u = arr.length - 1;
        int mid = 0;
        while (l <= u) {
            mid = l + ((u - l) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return -1;
    }
}