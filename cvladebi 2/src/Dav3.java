public class Dav3 {
    public static void main(String[] args) {
        int year = 2025;
        if (year % 400 == 0) {
            System.out.println("ნაკიანია");
        } else if (year % 100 == 0) {
            System.out.println("არ არის ნაკიანი");
        } else if (year % 4 == 0) {
            System.out.println("ნაკიანია");
        } else {
            System.out.println("არ არის ნაკიანი");
        }
    }
}
