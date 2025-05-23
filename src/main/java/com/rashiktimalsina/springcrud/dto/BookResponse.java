package com.rashiktimalsina.springcrud.dto;


/**
 * @author Rashik Timalsina
 * #created 11/04/2025
 */
public class BookResponse {

    private Long id;
    private String title;
    private String author;
    private double price;

    public BookResponse() {
    }

    public BookResponse(Long id, String title, String author, double price) {
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


