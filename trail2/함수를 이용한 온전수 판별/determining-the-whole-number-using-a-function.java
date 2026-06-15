import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 온전수의 개수
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if(isWhole(i)) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

        
    }

    public static boolean isWhole(int num) {
        if(!(num % 2 == 0) && !(num % 10 == 5) && !(num % 3 == 0 && num % 9 != 0)) {
            return true;
        }

        return false;
    }

    // 온전수의 조건 (아래 조건 모두 만족하면 안됨)
        // 2로 나누어 떨어짐
        // 1의 자리 5
        // 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않음

     
}