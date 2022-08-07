package homeworkbolum9.hw2;

public class Author {
    // ! HER AUTHORUN KAÇ KİTAP YAZDIĞI VE KAÇ OKUYUCUSUNUN OLDUĞU YAZILSIN, KAÇ
    // !KİŞİNİN BU AUTHORUN KİTABINI OKUDUĞUNU YAZDIRAN BİR METHOD EKLENSİN

    // nesne değişkenleri
    private String name;
    private int bookcount;
    private int readercount;

    // constructor : nesne kurduk :))
    public Author(String name, int bookcount, int readercount) {
        this.name = name;
        this.bookcount = bookcount;
        this.readercount = readercount;
    }

    // bookcount sayısını book girildikten sonra 1 arttırılması için increase
    // yaptık.

    public void increaseBookCount() {
        bookcount++;
    }

    // readercount sayısını Reader'da read methodu çağrıldığında +1.
    public void increaseReaderCount() {
        readercount++;
    }

    /*
     * GETTER AND SETTER bölümü (en sevdiğim :))
     * GETTER : Çağırdığımızda girdiğimiz değeri gösterir bize
     * SETTER : Nesne Değişkenine yeni değer atayabiliyoruz
     */
    public int getBookcount() {
        return bookcount;
    }

    public void setBookcount(int bookcount) {
        this.bookcount = bookcount;
    }

    public int getReadercount() {
        return readercount;
    }

    public void setReadercount(int readercount) {
        this.readercount = readercount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * toString Author'un bilgilerini yazdıran metot.
     * Override : İstediğimiz şekilde hepsinin üstüne yazmamızı sağlıyor
     * 
     */

    @Override
    public String toString() {
        System.out.println(
                name + " yazarının " + readercount + " tane okuyucusu var ve " + bookcount + " tane de kitabı var.");
        return super.toString();
    }

}
