package hw9;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(){}

    public Book(String name, String author, int year){
        setName(name);
        setAuthor(author);
        setYear(year);
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void presentation(String presentation){
        System.out.println("This book is about " + presentation);
    }

    public void printInfo(){
        System.out.println("Book: \"" + name + "\" " + year + " " + author);
    }
}
