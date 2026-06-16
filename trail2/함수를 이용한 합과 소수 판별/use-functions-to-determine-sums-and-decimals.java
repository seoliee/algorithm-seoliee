import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 결과
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (isAnswer(i)) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }

    // 1. 소수인지 판별하고 그 중에서 모든 자릿수의 합이 짝수인 애들 구하기
    public static boolean isAnswer(int num) {
        // 1. 소수인가
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        if (((num / 10) + (num % 10)) % 2 != 0) {
            return false;
        }

        return true;
    }
}