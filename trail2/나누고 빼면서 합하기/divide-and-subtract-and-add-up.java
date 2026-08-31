import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int answer = arr[m - 1];
        add(m, arr, answer);
    }

    public static void add(int m, int[] arr, int answer) {
        while(m > 1) {
            // m이 짝수면 2로 나누고 홀수면 1을 뺌
            if(m % 2 == 0) {
                m = m / 2;
            } else {
                m -= 1;
            }

            answer += arr[m - 1];
        }
        System.out.println(answer);
    }
}