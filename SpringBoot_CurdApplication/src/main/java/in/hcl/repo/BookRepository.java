package in.hcl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.hcl.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	//public List<Book>   findByBookPriceGreaterThan(Double bookPrice);
    @Query(value = "select * from Book",nativeQuery = true)
	public List<Book> getAllBooks();


}
