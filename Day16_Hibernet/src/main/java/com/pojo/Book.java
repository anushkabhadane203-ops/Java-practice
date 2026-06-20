
package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    private int bookid;

    @Column
    private String name;

    @Column
    private String author;

    @Column
    private double price;

    public Book() {
    }

    public Book(int bookid, String name, String author, double price) {
        this.bookid = bookid;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
    }
}
	