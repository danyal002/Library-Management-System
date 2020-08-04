/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danyal
 */
public class Book {

    //Class Attributes
    long isbn;
    String name;
    String author;
    String publisher;
    String datePublished;
    String dateAdded;
    int copiesOwned;
    ArrayList<String> genre = new ArrayList<>();
    int currentStock;

    //Constructor
    public Book(long isbn, String name, String author, String publisher, String datePublished, String dateAdded, int copiesOwned, ArrayList<String> genre, int currentStock) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.datePublished = datePublished;
        this.dateAdded = dateAdded;
        this.copiesOwned = copiesOwned;
        this.genre = genre;
        this.currentStock = currentStock;
    }

    //Getter methods for this class
    public long getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public int getCopiesOwned() {
        return copiesOwned;
    }

    public List<String> getGenre() {
        return genre;
    }

    public int getCurrentStock() {
        return currentStock;
    }

//Setter methods for this class
    public void setISBN(long x) {
        isbn = x;
    }

    public void setCopiesOwned(int x) {
        copiesOwned = x;
    }

    public void setCurrentStock(int x) {
        currentStock = x;
    }

    public void setName(String x) {
        name = x;
    }

    public void setAuthor(String x) {
        author = x;
    }

    public void setDatePublished(String x) {
        datePublished = x;
    }

    public void setPublisher(String x) {
        publisher = x;
    }

    public void setDateAdded(String x) {
        dateAdded = x;
    }

    public void setGenre(ArrayList<String> x) {
        genre = x;
    }
}
