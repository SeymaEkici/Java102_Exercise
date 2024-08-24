public class Book implements Comparable<Book>{

    private String title;
    private int numberOfPages;
    private String author;
    private String publicationDate;

    public Book(String title, int numberOfPages, String author, String publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public int compareTo(Book other){
        return this.title.compareTo(other.title);
    }

    public String toString(){
        return "Book {" +
                "title= '" + title + "'" +
                ", page count= " + numberOfPages +
                ", author name= '" + author + "'" +
                ", publication date= " + publicationDate +
                "}";
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

}