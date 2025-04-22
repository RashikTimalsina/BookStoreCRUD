package com.rashiktimalsina.springcrud.service;

import com.rashiktimalsina.springcrud.model.Book;
import java.util.List;

/**
 * @author Rashik Timalsina
 * #created 13/04/2025
 */


public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
