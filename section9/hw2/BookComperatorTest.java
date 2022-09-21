import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookComperatorTest {
    public static void main(String[] args) {
        Author ath1 = new Author("Kader", 8, 5);
        Author ath2 = new Author("Ali", 4, 2);
        Author ath3 = new Author("Eren", 6, 1);

        Book bk1 = new Book(ath1, "Kedi", 780, "type", true, 378,BookType.nonFinction);
        Book bk2 = new Book(ath2, "Köpek", 478, "type", false, 50,BookType.dram);
        Book bk3 = new Book(ath3, "Balık", 480, "type", true, 142,BookType.scientific);

        Comparator<Book> comparator = (o1, o2) -> o1.getPage()-o2.getPage();
        
        BinaryOperator<Book> longest = BinaryOperator.maxBy(comparator);
        Book maxPageBook = longest.apply(bk2, bk3);

        System.out.println("THE BOOK WHICH IOS THE LONGEST");
        System.out.println(maxPageBook);
    }
}
