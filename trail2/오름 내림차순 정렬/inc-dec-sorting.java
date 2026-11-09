import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);
        Integer[] desc = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(desc, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(desc[i] + " ");
        }
    }
}