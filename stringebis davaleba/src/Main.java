import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //n1
        String s1 = x.nextLine();
        int n = 0;
        for (char y : s1.toCharArray()) {
            if (Character.isDigit(y)) {
                n++;
            }
        }
        System.out.println(n);
        //n2
        n = 0;
        for (char y : s1.toCharArray()) {
            if (y == '.' || y == '?' || y == '!' || y == ';') {
                n++;
            }
        }
        System.out.println(n);
        //n4
        String s2 = x.nextLine();
        if (s1.contains(s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        //n5
        char y = s1.charAt(s1.length() - 1);
        if ("aeiou".indexOf(y) != -1) {
            System.out.println("vowel");
        } else if (Character.isLetter(y)) {
            System.out.println("consonant");
        } else {
            System.out.println("not a letter");
        }
        //n7
        n = s1.length();

        if (n > 10) {
            System.out.println("huge" + s1.charAt(0) + (n - 2) + s1.charAt(n - 1));
        } else {
            System.out.println("Not huge");
        }
    }
}
