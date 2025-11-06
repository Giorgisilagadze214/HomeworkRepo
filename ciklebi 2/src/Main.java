import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// N1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n: ");
//        int n = sc.nextInt();
//        double x = 0;
//        for (int i = 1; i <= n; i++) {
//            x += i;
//        }
//        System.out.println(x/n);
// N2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n: ");
//        int n = sc.nextInt();
//        int x = 1;
//        while (x * 2 <= n) {
//            x *= 2;
//        }
//        while (n > 0) {
//            if (n >= x) {
//                System.out.print(x + " ");
//                n -= x;
//            }
//            x /= 2;
//        }
// N3
//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 == 0 || i == 5 || i == 7 || i == 11)
//                continue;
//            System.out.println(i);
//        }
// N4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("x: ");
//        String x = sc.next();
//        int y = Integer.parseInt(x,2);
//        System.out.println(y);
// N5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("x: ");
//        int x = sc.nextInt();
//        String y = Integer.toBinaryString(x);
//        System.out.println(y);
// N6
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(100) + 1;
        int y;
        System.out.println("Guess(1-100):");
        while (true) {
            y = sc.nextInt();
            if (y < x) {
                System.out.println("too low");
            } else if (y > x) {
                System.out.println("too high");
            } else {
                System.out.println("correct");
                break;
            }
        }
    }
}