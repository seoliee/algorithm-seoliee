import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int length = a.length();
        boolean isPalindrome = true;
        
        for(int i = 0; i < length / 2; i++) {
            if(a.charAt(i) != a.charAt(length - 1 - i)) {
                isPalindrome = false;
            } else {
                isPalindrome = true;
            }
        }

        if(isPalindrome) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}