import main.java.com.semicolon.africa.model.Bank;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class BankTest {
    //@BeforeEach
   // public void setUp(){
       // Bank bankAccount = new Bank("Akinyemi","Ayomide","1234");

   // }
    @Test
    public void testThatCreateAccount(){
        Bank bankAccount = new Bank("Akinyemi","Ayomide","1234",9155300427L,"8118861188");
        assertEquals("Akinyemi",bankAccount.getFirstName());
        assertEquals("Ayomide",bankAccount.getLastName());
        assertEquals("1234",bankAccount.getPinCode());
    }
    @Test
    public void testThatConfirmPin(){
        Bank bankAccount = new Bank("Akinyemi","Ayomide","1234",9155300427L,"8118861188");
      assertTrue(bankAccount.confirmPin("1234"));
      assertFalse(bankAccount.confirmPin("4321"));
    }
    @Test
    public void testThatInitialMoneyDeposited(){
        Bank bankAccount = new Bank();
         assertEquals(0,bankAccount.depositeAmount(0));
    }
    @Test
    public void testThatInitialMoneyWithdrawal(){
        Bank bankAccount = new Bank("Akinyemi","Ayomide","1234",9155300427L,"8118861188");
        bankAccount.depositeAmount(100);
        bankAccount.withdrawMoney("1234",50,"9155300427");
        assertEquals(50,bankAccount.getBalance());
    }
    @Test
    public void testThatTransferMoney(){
        Bank bankAccount = new Bank("Akinyemi","Ayomide","1234",9155300427L,"8118861188");
        bankAccount.depositeAmount(100);
        bankAccount.transferMoney("1234",50,"8118861138");
        assertEquals(50,bankAccount.getBalance());
        assertEquals("1234",bankAccount.getPinCode());
        
    }
    @Test
    public void testThatTransferMoneyWithbalace(){
        Bank bankAccount = new Bank("Akinyemi","Ayomide","1234",9155300427L,"8118861188");
        bankAccount.depositeAmount(100);
        bankAccount.withdrawMoney("1234",50,"9155300427");
        bankAccount.transferMoney("1234",50,"8118861138");
        bankAccount.checkBalance("1234",0,"9155300427");
        assertEquals(0,bankAccount.getBalance());
        assertEquals("1234",bankAccount.getPinCode());
    }
}
