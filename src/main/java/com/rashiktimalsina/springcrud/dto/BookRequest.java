package com.rashiktimalsina.springcrud.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Rashik Timalsina
 * #created 11/04/2025
 */
public class BookRequest {

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Author cannot be blank")
    private String author;


    private double price;

    public BookRequest() {

    }

    public BookRequest(Long id, String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

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


