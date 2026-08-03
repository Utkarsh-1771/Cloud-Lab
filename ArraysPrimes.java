
import java.util.*;

class ArraysPrimes {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = generatePrimes(n);
        System.out.print(Arrays.toString(arr));
    }

    static int[] generatePrimes(int n) {
        int p = 2;
        int arr[] = new int[n];
        int i = 0;
        while (n != 0) {
            if (prime(p)) {
                arr[i++] = p;
                n--;
            }
            p++;
        }
        return arr;
    }

    static boolean prime(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
