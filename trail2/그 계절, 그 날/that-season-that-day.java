import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        String answer = "";
        if (isLeapYear(y)) {
            if (m == 2) {
                if (d <= 29) {
                    System.out.println(season(m));
                } else {
                    System.out.println(-1);
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d <= 30) {
                    System.out.println(season(m));
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(season(m));
            }
        } else {
            if (m == 2) {
                if (d <= 28) {
                    System.out.println(season(m));
                } else {
                    System.out.println(-1);
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d <= 30) {
                    System.out.println(season(m));
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(season(m));
            }
        }

        // System.out.println("y: " + y + ", m: " + m + ", d: " + d);
        // 1. y년의 날짜 중 m월 d일이 존재하는가
        // 2. 어떤 계절인가


 
    
    }

            // 윤년인가
        public static boolean isLeapYear(int y) {
            if (((y % 4 == 0) || ((y % 4 == 0) && (y % 100 == 0) && (y % 400 == 0))) && !((y % 4 == 0) && (y % 100 == 0))) {
                return true;
            } else {
                return false;
            }
        }

        // 계절
        public static String season(int m) {
            if (m >= 3 && m <= 5) {
                return "Spring";
            } else if (m >= 6 && m <= 8) {
                return "Summer";
            } else if (m >= 9 && m <= 11) {
                return "Fall";
            } else {
                return "Winter";
            }
        }
}
