/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Book {
    // Variables
    private String title;
    private int pages;
    private int publicationYear;
    
    // Constructor
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
