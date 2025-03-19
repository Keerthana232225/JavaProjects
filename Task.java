package Day3Programs;
import java.util.*;
class Library{
	int BookId;
	String Title;
	String Author;
	double price;

    Library(int BookId,String Title,String Author,double price){
    	this.BookId=BookId;
    	this.Title=Title;
    	this.Author=Author;
    	this.price=price;
    	
    }
    void mydetails() {
    	System.out.println("The Book ID is:"+BookId);
    	System.out.println("Title of the book is:"+Title);
    	System.out.println("Author of the book is:"+ Author);
    	System.out.println("The price of the book is :"+price);
    
    	
    }
}



public class Task {
	public static void main(String[] args) {
		Library l1 = new Library(232225,"My Best Friend","Ananya",500);
		l1.mydetails();
		
		
	}
}