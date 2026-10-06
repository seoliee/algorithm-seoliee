import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        answer(n);
        
    }

    public static void answer(int n) {
        // 종료 조건
        if(n == 0) {
            return;
        }
        else {
            System.out.print(n + " ");
            answer(n - 1);
            System.out.print(n + " ");
        }
    }
}