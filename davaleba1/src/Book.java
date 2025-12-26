// n1
import java.util.Objects;
public class Book {
    private String title;
    private int pages;
    private String genre;
    private Writer author;
    public Book(String title, int pages, String genre, Writer author) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }
    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (!(x instanceof Book)) return false;
        Book book = (Book) x;
        return pages == book.pages &&
                Objects.equals(title, book.title) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, pages, genre, author);
    }
    @Override
    public String toString() {
        return "Title: " + title +
                ", Pages: " + pages +
                ", Genre: " + genre +
                ", Author: " + author;
    }
}
