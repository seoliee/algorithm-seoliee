import java.util.Scanner;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(counting(n));
    }

    public static int counting(int n) {
        // 종료조건
        if(n == 1) {
            return count;
        }

        // n이 짝수인 경우
        if(n % 2 == 0) {
            count++;
            return counting(n / 2);
        } else {
            count++;
            return counting(n / 3);
        }
    }
    
}