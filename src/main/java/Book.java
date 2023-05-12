public class Book {
    public String title;
    public int pages;
    public int year;

    public Book(String bookTitle, int bookPages, int bookYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = bookYear;
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
