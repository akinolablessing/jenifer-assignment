import main.java.com.semicolon.africa.model.Account;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class AccountTest {



    @Test
    public void testThatIHaveAnAccount(){
        Account account = new Account();
        assertTrue(account.iHaveAnAccount());
    }
   @Test
    public void testThatDepositAmount_initialBalanceShouldBeZero(){
        Account account = new Account();
        assertEquals(0,account.getBalance());
   }
   @Test
   public void testThatDepositAmountSIncreasesMustBePositive(){
     Account account = new Account();
     account.depositAmount(100);
     assertEquals(100,account.getBalance());
   }
   @Test
    public void testThatWithdrawFunds(){
        Account account = new Account();
        account.depositAmount(100);
        account.withdrawAmount(50);
        assertEquals(50,account.getBalance());
   }
   @Test
    public void testThatCheckBalance(){
        Account account = new Account();
        account.depositAmount(100);
        account.withdrawAmount(50);
        assertEquals(50,account.getBalance());
   }
   @Test
    public void testThatUpdateBalance(){
        Account account = new Account();
        account.depositAmount(100);
        assertEquals(100,account.getBalance());
   }
   @Test
    public void testThatUpdatePin(){
        Account account = new Account();
        account.updatePin("1234");
        assertEquals("1234", account.getPin());
   }
   @Test
    public void testThatUpdatePinIsWrong(){
        Account account = new Account();
        account.updatePin("1234");
        assertFalse(account.confirmPin("4321"));
   }
}
