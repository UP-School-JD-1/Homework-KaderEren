package homeworkbolum8.hw2;

public class ReaderTest {
    public static void main(String[] args) {
        // ! AUTHOR OLUŞTUR 3
        // ! 5 ADET OKUYUCU OLUŞTUR
        // ! 3 ADET KİTAP OLUŞTUR


        //En soldaki Author (Class) nesnenin tipi. 
        //!Constructor yardımı ile nesneyi oluşturuyoruz.

        // AUTHORS
        Author ath1 = new Author("Kader", 8, 5);
        Author ath2 = new Author("Ali", 4, 2);
        Author ath3 = new Author("Eren", 6, 1);

        // READERS
        Reader rd1 = new Reader("İrem", 24, "female");
        Reader rd2 = new Reader("Ayşe", 22, "female");
        Reader rd3 = new Reader("Mehmet", 18, "male");
        Reader rd4 = new Reader("Merve", 30, "female");
        Reader rd5 = new Reader("Cenk", 25, "male");

        // BOOKS
        Book bk1 = new Book(ath1, "Kedi", 780, "type", true, 378);
        Book bk2 = new Book(ath2, "Köpek", 560, "type", false, 50);
        Book bk3 = new Book(ath3, "Balık", 480, "type", true, 142);


        /*  Birinci okuyucunun okuduğu kitabı okuduğunu yazıyoruz. rd1 nesnesi read metotu ile okuduğu book (bk1 / bk2 / bk3) belirtiliyor. 
            ve sonuçlara göre hangi reader kaç kitap okumuş bilgisine erişebiliriz.*/
        rd1.read(bk1);
        rd2.read(bk1);
        rd2.read(bk2);
        rd2.read(bk3);
        rd3.read(bk2);
        rd3.read(bk3);
        rd5.read(bk2);

        //toString metotu ile hangi author'un belirttiğimiz bilgilerini yazdırıyor.

        System.out.println();

        ath1.toString();

        System.out.println();

        ath2.toString();

        System.out.println();

        ath3.toString();

        

    }
}