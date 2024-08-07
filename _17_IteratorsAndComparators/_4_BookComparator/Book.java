package _17_IteratorsAndComparators._4_BookComparator;

import java.util.Arrays;
import java.util.List;

public class Book {
    public String getTitle() {
        return title;
    }

    private String title;
    private int year;

    public int getYear() {
        return year;
    }

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


}
