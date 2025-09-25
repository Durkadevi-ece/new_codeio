package week_3;
//book class with constructor
public class bookClass {
    public static void main(String[] args){
        Book1 b1 = new Book1();
        b1.title = "Thirukkural";
        b1.author = "Thiruvalluvar";
        b1.price = 250;
        b1.displayBookDetails();
        Book2 b2 = new Book2("Romeo & Juliet","Shakespeare",450);
        b2.displayBookDetails();
    }
}
class Book1 {
    String title;
    String author;
    int price;

    void displayBookDetails(){
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
        System.out.println();
    }
}
class Book2{
    String title;
    String author;
    int price;
    Book2( String title ,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails(){
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
    }

}