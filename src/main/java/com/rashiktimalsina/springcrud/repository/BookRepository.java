package com.rashiktimalsina.springcrud.repository;

import com.rashiktimalsina.springcrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Rashik Timalsina
 * #created 13/04/2025
 */

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByTitleAndAuthor(String title, String author);



}
