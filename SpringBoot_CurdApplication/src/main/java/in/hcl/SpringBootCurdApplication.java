package in.hcl;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.hcl.entity.Book;
import in.hcl.repo.BookRepository;

@SpringBootApplication
public class SpringBootCurdApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = 
				SpringApplication.run(SpringBootCurdApplication.class, args);
		BookRepository repo = 
				cxt.getBean(BookRepository.class);
		//String name = repo.getClass().getName();
		//System.out.println(name);

		/*
		 * Book b=new Book(); b.setBookId(101); b.setBookName("Spring");
		 * b.setBookPrice(1000.00); repo.save(b); System.out.println("Record Inserted");
		 */

		//		Book b1=new Book();
		//		b1.setBookId(103);
		//		b1.setBookName("core java");
		//		b1.setBookPrice(2500.0);
		//
		//		Book b2=new Book();
		//		b2.setBookId(104);
		//		b2.setBookName("Spring");
		//		b2.setBookPrice(3500.0);
		//		
		//		repo.saveAll(Arrays.asList(b1,b2));
		//
		//		System.out.println("Record Inserted");

		//		boolean status = repo.existsById(103);
		//		System.out.println(status);

		//		long count = repo.count();
		//		System.out.println(count);

		//		Optional<Book> findById = repo.findById(103);
		//		if (findById.isPresent()) {
		//			System.out.println(findById);
		//
		//		}

		//		List<Book> findAll = repo.findAll();
		//		for (Book book : findAll) {
		//			System.out.println(book);
		//			
		//		}

		//		List<Book> books = repo.findByBookPriceGreaterThan(2500.00);
		//		for (Book book : books) {
		//			System.out.println(book);
		//
		//		}

		List<Book> allBooks = repo.getAllBooks();
		for (Book book : allBooks) {
			System.out.println(book);

		}

	}

}
