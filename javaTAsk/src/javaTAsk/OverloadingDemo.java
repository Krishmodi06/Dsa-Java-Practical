package javaTAsk;


class Book{
	String name ;
	String BookId;
	String Author;
	
	Book(){
		this.name="Nothing";
	
	}
	
	Book(String name,String BookId){
		this.name=name;
		this.BookId =BookId;
		
	}
	
	Book(String name,String BookId,String Author){
		this.name=name;
		this.BookId =BookId;
		this.Author=Author;
	}
	
	void displayBookInfo() {
		System.out.printf("\nBook Name : %s \nBook Id : %s \nBook Author : %s\n",name,BookId,Author);
	}
}

public class OverloadingDemo {
	
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("Expert in Java","1422");
		Book book2 = new Book("Make easy in Java","72672","You");
		book.displayBookInfo();
		book1.displayBookInfo();
		book2.displayBookInfo();
	}

	
}
