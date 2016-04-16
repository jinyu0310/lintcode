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
		
		//通过newInstance创建对象，刚创建时没有任何值？
		//new创建时必须初始化，引用类型null，基本类型0;
//		String string = String.class.newInstance();
//		String s;
//		System.out.println(string.concat("JY"));
//		System.out.println(s);
		
		try {
			Class<Book> bookClass = Book.class; //直接获取类对象
			Book book2 = bookClass.newInstance(); //只能调用无参构造方法，如果重载了构造方法，必须自定义无参构造方法才能使用
			System.out.println(1);
			System.out.println(book2.getAuthor());
			System.out.println(book2.getName());
			System.out.println(book2.getISBN());
			book2.setAuthor("JY");
			book2.setName("JAVA");
			Book book3 = (Book)book2.clone(); //实现Cloneable接口
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
