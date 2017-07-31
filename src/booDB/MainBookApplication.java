package booDB;
import java.util.Scanner;
public class MainBookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDatabase newBookDB=new BookDatabase();
		Book newBook=new Book();
		Scanner scan=new Scanner(System.in);
		boolean cont=true;
		
		newBook.setSku("java1001");
		newBook.setTitle("Introduction to Java");
		newBook.setAuthor("nokolk jkjgkjg");
		newBook.setDescription("simple way to java");
		newBook.setPrice(45.5);
		
		newBookDB.addBook(newBook);
		
	while(cont)
	{
		System.out.println("Do you want to 'add' a new book or 'search' for a book?");
	   String response=scan.next();
	 if (response.equalsIgnoreCase("search"))
	  {
	
		System.out.println("Do you have the sku, title or author of the book?" );
		 response= scan.next();
		 scan.nextLine();
		
		  if (response.equalsIgnoreCase("sku"))
		  { 
			System.out.println("Please enter the sku of the book?" );
			 response= scan.next();
			 scan.nextLine();
			 if (newBook.getSku().equalsIgnoreCase(response))
			   {
				   
			    System.out.println(newBook.getSku() +'\n'+ newBook.getTitle()+'\n'+newBook.getAuthor()+'\n'+newBook.getDescription());
			   }
		 }
		 if  (response.equalsIgnoreCase("title"))
		 {
			System.out.println("Please enter the title of the book?" );
			 response= scan.nextLine();
			 if (newBook.getTitle().equalsIgnoreCase(response))
			   {
				   
			    System.out.println(newBook.getSku() +'\n'+ newBook.getTitle()+'\n'+newBook.getAuthor()+'\n'+newBook.getDescription());
			   }
		 }
		if ( response.equalsIgnoreCase("author"))
		 {
			
			System.out.println("Please enter the author of the book?" );
			 response= scan.nextLine();
			 if (newBook.getAuthor().equalsIgnoreCase(response))
			   {
				   
			    System.out.println(newBook.getSku() +'\n'+ newBook.getTitle()+'\n'+newBook.getAuthor()+'\n'+newBook.getDescription());
			   }
		 
         }
	  }
	 else if (response.equalsIgnoreCase("add"))
	 {
		 System.out.println("Please enter your book information");
		 System.out.println("What is the Sku of your book?");
		 String newinf= scan.nextLine();
		 scan.nextLine();

		
		 System.out.println("What is the Title of your book?");
		 newinf= scan.nextLine();
		 
		 System.out.println("Who is the Author of your book?");
		 newinf= scan.nextLine();
		 
		 System.out.println("Enter a brief discription of the book");
		 newinf= scan.nextLine();
		 
		 System.out.println("What is the price of your book?");
		 newinf= scan.nextLine();
		 
		 
		 newBookDB.addBook(newBook);
		 
		 System.out.println("the book you entered is:");
		 System.out.println(newBook.getSku() +'\n'+ newBook.getTitle()+'\n'+newBook.getAuthor()+'\n'+newBook.getDescription());
		   
	}
	else 
	{
		 cont=false;
	}
}

}
}
