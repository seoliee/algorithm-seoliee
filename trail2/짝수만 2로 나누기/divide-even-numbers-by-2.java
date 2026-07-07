import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divide(n, arr);
    }

    public static void divide(int num, int[] arr) {
        for(int i = 0; i < num; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}