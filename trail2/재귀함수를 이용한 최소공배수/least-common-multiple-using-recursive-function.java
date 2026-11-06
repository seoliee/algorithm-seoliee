import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(f(arr, n));
    }
    // arr의 앞에서 n개까지의 최소공배수 반환하는 재귀함수
    public static int f(int[] arr, int n) {
        if(n == 1)
            return arr[0];
        else 
            return lcm(f(arr, n-1), arr[n-1]);
    }
    public static int lcm(int a, int b) {
        int answer = 1;
        while(answer % a != 0 || answer % b != 0) {
            answer++;
        }
        return answer;
    }
}