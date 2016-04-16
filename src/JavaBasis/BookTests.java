package JavaBasis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BookTests {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
//		Book book = new Book("JY","JAVABASIS");
//		System.out.println(book.getAuthor());
//		System.out.println(book.getName());
//		System.out.println(book.getISBN());
		
		//ͨ��newInstance�������󣬸մ���ʱû���κ�ֵ��
		//new����ʱ�����ʼ������������null����������0;
//		String string = String.class.newInstance();
//		String s;
//		System.out.println(string.concat("JY"));
//		System.out.println(s);
		
		try {
			Class<Book> bookClass = Book.class; //ֱ�ӻ�ȡ�����
			Book book2 = bookClass.newInstance(); //ֻ�ܵ����޲ι��췽������������˹��췽���������Զ����޲ι��췽������ʹ��
			System.out.println(1);
			System.out.println(book2.getAuthor());
			System.out.println(book2.getName());
			System.out.println(book2.getISBN());
			book2.setAuthor("JY");
			book2.setName("JAVA");
			Book book3 = (Book)book2.clone(); //ʵ��Cloneable�ӿ�
			System.out.println(2);
			System.out.println(book3.getAuthor());
			System.out.println(book3.getName());
			book3.setName("Python");
			System.out.println(3);
			System.out.println(book2.getName());
			System.out.println(book3.getName());
			
			Constructor<Book> constructor = Book.class.getConstructor(String.class,String.class,String.class);
			Book book4 = constructor.newInstance("JY2","JAVABASIS","123456");
			System.out.println(4);
			System.out.println(book4.getAuthor());
			System.out.println(book4.getName());
			System.out.println(book4.getISBN());
			
			ComicBook comicBook = new ComicBook("JY3", "7longzhu", "121", "hong");
			System.out.println(5);
			System.out.println(comicBook.getAuthor());
			System.out.println(comicBook.getName());
			System.out.println(comicBook.getISBN());
			System.out.println(comicBook.getFengmian());

			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
