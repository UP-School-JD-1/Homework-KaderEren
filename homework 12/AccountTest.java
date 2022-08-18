import javax.security.auth.login.AccountLockedException;

public class AccountTest {
    public static void main(String[] args) {

        Account kader = new Account("1234567890", 882);
        Account mehmet = new Account("987654321", 120);
        AccountClient client = new AccountClient(kader);

        // tanımlanan nesneden AccountClien claas'ında oluşturduğumuz metotları çağırarak
        // içerisine girdiğimiz parametreler ile işlemler yapılıyor.

        client.withdrawMoney(50);
        client.depositMoney(84);
        client.transferMoney(525, mehmet);
        
    }


}
