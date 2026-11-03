import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int cnt = 2;

        int result = sequence(n, cnt);
        System.out.println(result);

    }

    public static int sequence(int n, int cnt) {
        if(n == 1)
            return 2;
        else if(n == 2)
            return 4;
        else {
            cnt++;
            return (sequence(n - 2, cnt) * sequence(n - 1, cnt)) % 100;
        }
    }
}