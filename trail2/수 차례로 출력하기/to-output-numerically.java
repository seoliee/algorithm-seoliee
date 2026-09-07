import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n 입력받음
        // Please write your code here.
        // 1 -> n까지 출력
        ascend(n);
        // 줄바꿈 출력
        System.out.println();
        // n -> 1까지 출력
        descend(n);
    }

    public static void ascend(int n) {
        // 종료 조건
        if(n == 0)
            return;
        ascend(n - 1);
        System.out.print(n + " ");
    }

    public static void descend(int n) {
        // 종료 조건
        if(n == 0)
            return;
        System.out.print(n + " ");
        descend(n - 1);
    }
}