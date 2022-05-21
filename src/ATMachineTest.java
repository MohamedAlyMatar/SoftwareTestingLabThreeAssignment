import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ATMachineTest {

    @Test
    public void integrationsTest(){
        ATMachine atmTest = new ATMachine();

        //test case to test ActionsTaken() that calls all main three get...() functions together.
        assertEquals("Account Balance = 0.0\nWithdrawaled balance = 0.0\nDeposited balance = 0.0", atmTest.ActionsTaken());

        //test case to test setDeposit() Function.
        assertEquals("Deposit Completed.", atmTest.setDeposit(300));

        //test case to test setWithdrawal() Function that calls getBalance().
        assertEquals("Please make sure to have enough balance for the withdrawal operation or make a deposit.", atmTest.setWithdrawal(400));

        //test case to test setDeposit() Function.
        assertEquals("Deposit Completed.", atmTest.setDeposit(500));

        //test case to test setWithdrawal() Function that calls getBalance() with different condition.
        assertEquals("Withdrawal Completed.", atmTest.setWithdrawal(400));

        //test case to test ActionsTaken() that calls all main three get...() functions together with different values.
        assertEquals("Account Balance = 400.0\nWithdrawaled balance = 400.0\nDeposited balance = 800.0", atmTest.ActionsTaken());

    }

}