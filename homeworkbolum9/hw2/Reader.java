package homeworkbolum9.hw2;

public class Reader {
    private String name;

    private int age;

    private String sex;

    //Const. ile nesne kurduk. Reader = constr)

    public Reader(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Bir Reader'ın nesnesinin kitabı okuma işlevini gerçekleştiren metot.
    public Book read(Book book){
        //Toplam sayfadan şu an olunan sayfa numarası çıkartılarak remaining hesaplandı. 
       // int remaining = (book.getPage()-book.getCurrentPage());
        
        //Her Reader'ın objesi kitap okuduğunda yazarın okur sayısını arttırıyor.
        book.increaseReaderCount();
        System.out.println(name + " adlı kişi "+book.getTitle() +  " isimli kitabı okuyor ve bitirmesine " + book.getRemaining() + "sayfa kaldı.");
  
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}