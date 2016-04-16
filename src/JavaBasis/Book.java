package JavaBasis;

public class Book  implements Cloneable{


	private String Name;
	private String author;
	private String ISBN;
	
	public Book(String name,String author,String ISBN) {
		this.Name = name;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public Book(String name,String author){
		this.Name = name;
		this.author = author;
	}
	public Book(){
	}
	
	public Book clone(){
		Book book = null;
		try {
			book =  (Book) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
		
	}
	
	public Book(String name) {
		// TODO Auto-generated constructor stub
		this.Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}
