public class SalaryNotValid  extends Exception{
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Hesaplanılan maaş verisi geçerli değil!!!";
    }
}
