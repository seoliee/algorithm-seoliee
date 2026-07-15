import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper intWrapperA = new IntWrapper(a);
        IntWrapper intWrapperB = new IntWrapper(b);

        calc(intWrapperA, intWrapperB);
        System.out.print(intWrapperA.value + " " + intWrapperB.value);
    }

    public static void calc(IntWrapper a, IntWrapper b) {
        if(a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            a.value += 10;
            b.value *= 2;
        }
    }
}