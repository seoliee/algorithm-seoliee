import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(answer(n - 1, arr));
    }

    public static int answer(int i, int[] arr) {
        // 종료 조건
        if (i == 0)
            return arr[i];
        else
            return Math.max(answer(i - 1, arr), arr[i]);
    }
}