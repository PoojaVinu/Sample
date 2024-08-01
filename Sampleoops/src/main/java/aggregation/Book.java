package aggregation;

public class Book {
	String bookName;
	int year;
	String publication;
	Author a;
	public Book(String bookName,int year,String publication,Author a)
	{
		this.bookName=bookName;
		this.year=year;
		this.publication=publication;
		this.a=a;
	}
	public void display()
	{
		System.out.println("bookName " + bookName);
		System.out.println("year " + year);
		System.out.println("publication " + publication);
		System.out.println("author name " + a.authorName);
		System.out.println("author place " + a.authorPlace);
		System.out.println("number of books " + a.numBooks);
		
		
	}
	public static void main(String args[])
	{
		
		Author obj=new Author("pooja","ireland",90);
		Book obj1=new Book("abc" ,1992,"bnm",obj);
		obj1.display();
	}

}
