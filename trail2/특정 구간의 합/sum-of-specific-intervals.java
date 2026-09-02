import java.util.Scanner;
public class Main {
    public static int[] arr;  // 수열 A를 전역 변수로 표현

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 질의에 대한 답 M번 반복
        for (int i = 0; i < m; i++) {
            int answer = 0;
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            
            for(int j = a1; j <= a2; j++) {
                answer += arr[j - 1];
            }

            System.out.println(answer);

        }


    }


}