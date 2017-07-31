package booDB;

import java.util.ArrayList;


public class BookDatabase {
	
	ArrayList<Book>bookList= new ArrayList<Book>();
	
	
	public ArrayList<Book> searchByAuthor(String author)
	{
		return new ArrayList<Book>();
	}

	public ArrayList<Book> getBookList()
	{
		return bookList;
	}
	public void SetBookList(ArrayList<Book> bookList)
	{
		this.bookList=bookList;
	}
	public void addBook(Book bookToAdd)
	{
		bookList.add(bookToAdd);
	}
	

		
	
}
