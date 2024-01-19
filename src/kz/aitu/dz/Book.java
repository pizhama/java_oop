package kz.aitu.dz;

public class Book {
    private String title;
    private String author;
    private Integer pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    public String getTitle() {
        System.out.println("Getter for title was called");
        return title;
    }
    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException();
        }

        this.title = title;
    }

    public String getAuthor() {
        System.out.println("Getter for author was called");
        return author;
    }
    public void setAuthor(String author) {
        if (author == null) {
            throw new IllegalArgumentException();
        }

        this.author = author;
    }

    public int getPages() {
        System.out.println("Getter for pages was called");
        return pages;
    }
    public void setPages(Integer pages) {

        this.pages = pages;
    }
}