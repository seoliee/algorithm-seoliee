import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int answer = 0;
        System.out.println(calculate(n, answer));
    }

    public static int calculate(int n, int answer) {
        // 종료 조건
        if(n == 1)
            return answer;
        else 
            if(n % 2 == 0) {
                answer++;
                return calculate(n / 2, answer);
            }
            else {
                answer++;
                return calculate(3 * n + 1, answer);
            }
    }
}