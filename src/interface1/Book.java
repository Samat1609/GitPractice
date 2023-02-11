package interface1;

abstract public class Book implements Printable,Readable{
    public String name;
    private  String author;
    private int pages;
    private boolean isAudioBook;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAudioBook() {
        return isAudioBook;
    }

    public void setAudioBook(boolean isaudioBook) {
        isAudioBook = isaudioBook;
    }

    public String listening(){
        if (isAudioBook==true){
            return "Listening";
        }else{
            return null;
        }
    }
    public abstract String published();

    abstract  public String read();
    abstract public String print();



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
