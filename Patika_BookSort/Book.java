package Patika_BookSort;

public class Book implements  Comparable <Book>{
    private  String bookName;
    private  int pageNumber;
    private  String authorname;
    private  int publishDate;

    public Book(String bookName, int pageNumber, String authorname, int publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorname = authorname;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    @Override
    public  int compareTo(Book o){
        return getBookName().compareTo(o.getBookName());
    }
}
