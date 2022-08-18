// author / tittle / page / type / isHardCover / currentPage : Bunların hepsi NESNENİN DEĞİŞKENLERİ . Tiplerini belirttik ve bir yerde haberimiz olmadan hata olmaması için public değil private yaptık.

public class Book {
    private Author author;
    private String title;
    private int page;
    private String type;
    private boolean isHardCover;
    private int currentPage;
    private int remaining;
    private BookType bookType;
    private String desc;
    // constructor ile nesne oluşturuyoruz.



    public Book(Author author, String title, int page, String type, boolean isHardCover, int currentPage,
            BookType bookType) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
        this.remaining = (this.getPage() - this.getCurrentPage());
        author.increaseBookCount();
        this.bookType = bookType;
        this.desc = generateBookTypeDesc(bookType);

    }

    private String generateBookTypeDesc(BookType t) {
        if (t == BookType.fiction) {
            return "kurgu filmi";
        } else if (t == BookType.dram) {
            return "dram filmi";
        } else if (t == BookType.scientific) {
            return "bilim filmi";
        }
        return "diğer tür film";
    }

    // GETTER AND SETTERS

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public Author getAuthor() {
        return author;
    }

    public void increaseReaderCount() {
        author.increaseReaderCount();
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}

enum BookType {
    fiction,
    dram,
    nonFinction,
    scientific
}