public class Main {
    public static void main(String[] args) {
// N1
//        int x = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i % 5 == 0) x += i;
//        }
//        System.out.println(x);
// N2
//        int x = 416;
//        int x = 0;
//        while (x > 0) {
//            x /= 10;
//            x++;
//        }
//        System.out.println(x);
// N3
//        int x = 5;
//        boolean y = true;
//        for (int i = 2; i * i <= x && y; i++) {
//            if (x % i == 0) {
//                y = false;
//                System.out.println("not prime");
//            }
//        }
//        if (y == true) {
//            System.out.println("prime");
//        }
// N4
//        int x = 24, y = 36;
//        while (y != 0) {
//            int n = y;
//            y = x % y;
//            x = n;
//        }
//        System.out.println(x);
// N5
//        for (int x = 100; x <= 999; x++) {
//            int a = x / 100;
//            int b = (x / 10) % 10;
//            int c = x % 10;
//            int y = a + b + c;
//            if (x % y == 0) {
//                System.out.println(x);
//            }
//        }
// N6
        int x = 0, y = 1;
        System.out.println(x);
        System.out.println(y);
        for (int i = 2; i < 10; i++) {
            int n = x + y;
            System.out.println(n);
            x = y;
            y = n;
        }

    }
}