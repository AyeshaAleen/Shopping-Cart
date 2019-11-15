package com.Services;

import com.Domain.Books;
import com.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

/*    private List<Books> books = new ArrayList<>(Arrays.asList(
            new Books("Java: How to Program", "Abc", "Learning Materials", 0.0),
            new Books("C++: How to Program", "Abc", "Learning Materials", 0.0),
            new Books("C#: How to Program", "Abc", "Learning Materials", 0.0),
            new Books("C: How to Program", "Abc", "Learning Materials", 0.0)
    ));   */

    public List<Books> getAllBooks()
    {
       // return books;
        List<Books> books = new ArrayList<>();
        bookRepository.findAll().forEach(books :: add);
        return books;
    }

    public void addBook(Books book)
    {
       // books.add(book);
        bookRepository.save(book);
    }

    public void deleteBook(long id /*, Books book */)
    {
       // books.removeIf(t -> t.getId() == id);
        bookRepository.deleteById(id);
    }

    public void updateBook(long id, Books book)
    {
    /*   for (int i = 0; i <= books.size(); i++)
        {
            Books b = books.get(i);
            if (b.getId() == (id))
            {
                books.set(i, book);
                return;
            }
        }  */
       bookRepository.save(book);
    }
    public Books getBook (long id)
    {
      //  return books.stream().filter(t -> t.getId() == (id)).findFirst().get();
        return bookRepository.findById(id).orElse(null);
    }
}
