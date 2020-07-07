package HW9;

public class Book {
    private String nameOfBook;
    private String author;
    private int numberOfPages;

    public Book(String nameOfBook, String author, int numberOfPages) {
        this.nameOfBook=nameOfBook;
        this.author=author;
        this.numberOfPages=numberOfPages;
    }

    public Book(){
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNameOfBook(String nameOfBook){
        this.nameOfBook=nameOfBook;
    }
    public String getNameOfBook(){
        return nameOfBook;
    }
    public void setAuthor(String Author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void printBookInfo(){
        System.out.println("Name of Book= " + nameOfBook +"\nAuthor= " + author + "\nNumber Of Pages= " + numberOfPages);
    }

}
