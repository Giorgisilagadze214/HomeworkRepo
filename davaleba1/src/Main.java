public class Main {
    // n1
//    public static void main(String[] args) {
//        Writer writer1 = new Writer("George", "Orwell");
//        Writer writer2 = new Writer("J.R.R.", "Tolkien");
//
//        Book[] books = new Book[2];
//        books[0] = new Book("1984", 328, "Dystopian", writer1);
//        books[1] = new Book("The Hobbit", 310, "Fantasy", writer2);
//
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//
//        }
//    }
    // n2
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[5];
        fractions[0] = new Fraction(1, 2);
        fractions[1] = new Fraction(2, 4);
        fractions[2] = new Fraction(3, 4);
        fractions[3] = new Fraction(1, 2);
        fractions[4] = new Fraction(6, 8);
        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }
        int x = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
