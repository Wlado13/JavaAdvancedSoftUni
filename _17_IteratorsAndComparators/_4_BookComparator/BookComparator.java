package _17_IteratorsAndComparators._4_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book f, Book s){
        int result = f.getTitle().compareTo(s.getTitle());

        return result != 0
                ? result
                :Integer.compare(f.getYear(), s.getYear());
    }
}
