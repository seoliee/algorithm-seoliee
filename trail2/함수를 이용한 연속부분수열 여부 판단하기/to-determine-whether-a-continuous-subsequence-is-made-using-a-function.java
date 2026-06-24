import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        // 연속 부분수열이라면 Yes, 아니라면 No 출력

        System.out.println(answer(a, b, n1, n2));
    }

    public static String answer(int[] a, int[] b, int n1, int n2) {
        for (int i = 0; i <= (n1 - n2); i++) {
            // 만약 수열 B의 첫번째 숫자랑 수열 A의 숫자가 같다면 그 뒤의 숫자 확인
            boolean isSame = true;

            for (int j = 0; j < n2; j++) {
                if(a[i + j] != b[j]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                return "Yes";
            }
        }
        return "No";
    }

}