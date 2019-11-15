package com.Repository;

import com.Domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Long>{

    //getAllBooks()
    //getBook(int id)
    //updateBook(Books b)
    //deleteBook(int id)

}
