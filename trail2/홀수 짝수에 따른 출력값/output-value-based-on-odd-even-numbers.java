import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(add(n));
    }

    public static int add(int n) {
        if(n % 2 == 1) {
            if(n == 1)
                return n;
            else return add(n - 2) + n;
        } else
            if(n == 2)
                return n;
            else return add(n - 2) + n;
    }
}