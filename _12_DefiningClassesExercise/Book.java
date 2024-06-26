package _12_DefiningClassesExercise;

public class Book {

    //1. Fields:
    private String title;
    private String author;
    private Double price;

    //2. Constructor: creates new objects
     public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //3. Methods: actions
    public void sell(){
        System.out.printf("Book with title %s was sold %.2f", this.title,this.price);
    }

    public void setTitle(String title){
         this.title = title;
    }

    public String getTitle(){
         return this.title;
    }
}
