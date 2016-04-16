package JavaBasis;


public class ComicBook extends Book {
	private String fengmian;

	public ComicBook(String name,String author,String ISBN,String fengmian){
		super(name,author,ISBN);
		this.fengmian = fengmian;
	}
	
	public String getFengmian() {
		return fengmian;
	}

	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
}
