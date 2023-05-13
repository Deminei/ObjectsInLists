public class Book {
    public String title;
    public int pages;
    public int year;

    public Book(String bookTitle, int bookPages, int bookYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = bookYear;
    }
    public Book(String bookTitle, int bookPages) {
        this.title = bookTitle;
        this.pages = bookPages;

    }
    public Book(String bookTitle) {
        this.title = bookTitle;

    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
    public int getYear() {

        return year;
    }

}
