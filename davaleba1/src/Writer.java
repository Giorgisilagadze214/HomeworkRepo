// n1
import java.util.Objects;
public class Writer {
    private String firstName;
    private String lastName;
    public Writer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (!(x instanceof Writer)) return false;
        Writer writer = (Writer) x;
        return Objects.equals(firstName, writer.firstName) &&
                Objects.equals(lastName, writer.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
