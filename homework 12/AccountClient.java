public class AccountClient {
    //nesne değişkeni
    private Account customer;

    //transfer ücreti sabit kalacağı için final kullandık.

    public final static double fee=3;

    //contructor ile nesne oluşturduk.
    public AccountClient(Account account) {
        this.customer = account;
    }

    // GETTER : Account'un bilgisini veriyor.
    // SETTER : Account'un bilgisini değiştirmek için.
    public Account getAccount() {
        return customer;
    }

    public void setAccount(Account account) {
        this.customer = account;
    }


    //Para çekme metodu. Account class'ında oluşturduğumuz metotta changeBalance , ilk bakiyenin üstüne eklenecekse direkt miktar giriliyor. 
    //Eğer bakiye çıkışı olduysa da eksi (-) ile yazarak bakiyesinde azalan miktarı gösteriyor.
    public void withdrawMoney(double x){
        //şu id'li hesap şu kdar para çekti .... yeni bakiye: x
        customer.changeBalance(-x);
        System.out.println("\n"+customer.getAccountID() + " id'si " + x + " TL para çekti "  ) ;
        customer.balanceString();
        
    } 


    // Para yatırma methodu
    public void depositMoney(double x){
        //şu id'li hesap şu kdar para yatırdı .... yeni bakiye: x
        customer.changeBalance(x);
        System.out.println("\n"+customer.getAccountID() + " id'si " + x + " TL para yatirdi ") ;
        customer.balanceString();


    } 


    //Havale methodu. Bize bir sonuç döndürmeyeceği için (return kullanmayacağımızdan dolayı) void yaptık. Havale metotunda ise iki tane parametre bilgisiniz istiyoruz.
    //Ardından sonuçları yazdırıyoruz.  
    public void transferMoney(double amount, Account recevier ){
        customer.changeBalance(-amount-fee);
        recevier.changeBalance(amount);
        System.out.println("\n"+customer.getAccountID() + "id'li kullanıcı " + recevier.getAccountID() + "id'li kullaniciya " + amount + "TL para transferi yapti.");
        System.out.println(customer.getAccountID() + "id'li kullanicinin ");
        customer.balanceString();
        recevier.balanceString();
    }
}
