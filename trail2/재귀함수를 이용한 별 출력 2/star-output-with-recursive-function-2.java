import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        stars(n);

    }

    public static void stars(int n) {
        // 종료 조건
        if (n == 0) {
            return;
        }
        else {
            for(int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            stars(n - 1);
            for(int i = n; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}