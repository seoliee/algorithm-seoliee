import java.util.Scanner;
public class Main {
    static int a;
    static boolean isSame = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int[] arr = new int[26];  // 크기 26인 배열 생성 (알파벳은 26자)
        a = A.length();


        for(int i = 0; i < a; i++) {  // 문자열 A의 길이만큼 반복
            int code = (int)(A.charAt(i));  // 문자열 A의 i번째 문자코드
            arr[code - 97] += 1;  // 해당 문자코드의 배열 값 +1
        }

        result(arr);

        if(isSame) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }

    public static boolean result(int[] arr) {
        for(int i = 0; i < 26; i++) {
            if(arr[i] != a) {
                isSame = false;
            } else {
                isSame = true;
                break;
            }
        }

        return isSame;
    }
}