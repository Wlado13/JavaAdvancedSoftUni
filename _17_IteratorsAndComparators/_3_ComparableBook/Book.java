package _17_IteratorsAndComparators._3_ComparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements  Comparable<Book>{

    public String getTitle() {
        return title;
    }

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    private void setTitle(String title){
        this.title = title;
    }

    private void setYear(int year){
        this.year = year;
    }

    private void setAuthors(String... authors){
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book other){
        int result = this.title.compareTo(other.title);
        return result != 0
                ? result : Integer.compare(year, other.year);
    }
}
