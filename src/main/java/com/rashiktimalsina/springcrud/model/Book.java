package com.rashiktimalsina.springcrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

/**
 * @author Rashik Timalsina
 * #created 11/04/2025
 */

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id", nullable = false)
    private Long id;

    @NotNull
    @Column(name="title", nullable = false)
    @Size(min = 2, max = 100)
    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotNull
    @Column(name="author", nullable = false)
    @NotBlank(message = "Author cannot be blank")
    private String author;

    @Min(1)
    @Column(name="price", nullable = false)
    private double price;

    public Book() {}

    public Book(Long id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
