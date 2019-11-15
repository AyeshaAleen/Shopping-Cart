package com.Controllers;

import com.Domain.Books;
import com.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookController {

    @Autowired
    private BookService bookServices;

    @RequestMapping("/Books")
    @ResponseBody
    public List<Books> getAllBooks()
    {
        return bookServices.getAllBooks();
    }

    @RequestMapping("/Books/{id}")
    public Books getBook( @PathVariable long id)
    {
        return bookServices.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value= "/Books")
    public void addBook(@RequestBody Books book)
    {
        bookServices.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Books/{id}")
    public void updateBook(@RequestBody Books book, @PathVariable long id)
    {
        bookServices.updateBook(id, book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/Books")
    public void deleteBook(@PathVariable long id /*, @RequestBody Books book */)
    {
        bookServices.deleteBook(id);
    }

  /*  @GetMapping("/SchoolBook")
    @ResponseBody
    public List<SchoolBook> getAllSchoolBooks(){
        return Arrays.asList(
                new SchoolBook("Java: How to Program", "Xyz", "Learning Materials", 20, 40),
                new SchoolBook("C++: How to Program", "Xyz", "Learning Materials", 30, 20),
                new SchoolBook("C#: How to Program", "Xyz", "Learning Materials", 40, 8),
                new SchoolBook("Python: How to Program", "Xyz", "Learning Materials", 50, 7)
        );
    }   */
}
